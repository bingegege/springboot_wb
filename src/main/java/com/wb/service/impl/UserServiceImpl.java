package com.wb.service.impl;

import com.github.pagehelper.PageHelper;
import com.wb.dao.UserDao;
import com.wb.domain.User;
import com.wb.mbg.model.PmsBrand;
import com.wb.mbg.model.PmsBrandExample;
import com.wb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private RedisTemplate redisTemplate;


    //查所有用户
    @Override
    public List<User> queryAll(){
        return userDao.queryAll();
    }

    /**
     * 获取用户策略:先从缓存中获取用户，没有则读mysql数据，再将数据写入缓存
     */
    @Override
    public User findUserById(int id){
        String key = "user_"+id;
        ValueOperations<String,User>  operations = redisTemplate.opsForValue();
        //判断redis中是否有键为key的缓存
        boolean hasKey = redisTemplate.hasKey(key);
        if(hasKey){
            long startTime = System.currentTimeMillis(); //获取开始时间
            User user = operations.get(key);
            long endTime = System.currentTimeMillis(); //获取结束时间
            System.out.println("从Redis缓存中获取数据:"+user.getUserName()+"程序运行时间：" + (endTime - startTime) + "ms");
            System.out.println("-----------------------------");
            return user;
        }else{
            long startTime = System.currentTimeMillis(); //获取开始时间
            User user = userDao.findUserById(id);
            long endTime = System.currentTimeMillis(); //获取结束时间
            if(user!=null){
                System.out.println("查询Mysql数据库获取数据:"+user.getUserName()+"程序运行时间：" + (endTime - startTime) + "ms");
                System.out.println("------------写入缓存---------------------");
                //写入缓存
                operations.set(key,user,5, TimeUnit.HOURS);
            }
            return user;
        }
    }

    // 这里存到redis中的是json字符串
    @Override
    public List<User> findByPage1(int pageNum, int pageSize) {
        String key="page_"+pageNum+pageSize;
        ValueOperations<String,List<User>> operations = redisTemplate.opsForValue();
        //判断redis中是否有键为key的缓存
        boolean hasKey = redisTemplate.hasKey(key);
        if(hasKey){
            List<User> list=operations.get(key);
            System.out.println("从Redis缓存中获得list集合");
            return list;
        }else{
            PageHelper.startPage(pageNum, pageSize);
            List<User> list=userDao.findByPage();
            System.out.println("查询Mysql数据库获取分页数据");
            //写入缓存
            operations.set(key,list,3,TimeUnit.HOURS);
            return list;
        }
    }


    /**
     * 分页查询用户：其实我这样操作有问题，虽然是写入了缓存，但下次有数据被修改时缓存中数据没有得到修改，不过我就是测试下往缓存中
     * 写List集合，并且也设置了过期时间，这里存的是List集合
     */
    @Override
    public List<User> findByPage(int pageNum, int pageSize) {
        String key="page_"+pageNum+pageSize;
        ListOperations<String,List<User>> operations = redisTemplate.opsForList();
        //判断redis中是否有键为key的缓存
        boolean hasKey = redisTemplate.hasKey(key);
        if(hasKey){
            List<User> list=redisTemplate.opsForList().range(key,0,-1);
            System.out.println("从Redis缓存中获得list集合");
            return list;
        }else{
            PageHelper.startPage(pageNum, pageSize);
            List<User> list=userDao.findByPage();
            System.out.println("查询Mysql数据库获取分页数据");
            //写入缓存
            operations.rightPushAll(key,list);
            //设置过期时间，list不能像value那样直接在set的时候设置
            redisTemplate.expire(key,1,TimeUnit.HOURS);
            return list;
        }
    }


    //删除用户策略:删除数据表中数据，然后删除缓存
    @Override
    public int deleteUserById(int id){
        int result = userDao.deleteUserById(id);
        String key = "user_"+id;
        if(result!=0){
            boolean hasKey = redisTemplate.hasKey(key);
            if(hasKey){
                redisTemplate.delete(key);
                System.out.println("删除了缓存中的key:"+key);
            }
        }
        return result;
    }

    /**
     * 更新用户策略：先更新数据表，成功之后，删除原来的缓存，再更新缓存
     */
    @Override
    public int updateUser(User user) {
        ValueOperations<String, User> operations = redisTemplate.opsForValue();
        int result = userDao.updateUser(user);
        if (result != 0) {
            String key = "user_" + user.getId();
            boolean haskey = redisTemplate.hasKey(key);
            if (haskey) {
                redisTemplate.delete(key);
                System.out.println("删除缓存中的key-----------> " + key);
            }
            // 再将更新后的数据加入缓存
            User userNew = userDao.findUserById(user.getId());
            if (userNew != null) {
                operations.set(key, userNew, 3, TimeUnit.HOURS);
            }
        }
        return result;
    }

    //添加用户
    @Override
    public int save(User user) {
        ValueOperations<String, User> operations = redisTemplate.opsForValue();
        int result=userDao.save(user);
        if(result!=0){
            String key = "user_" + user.getId();
            User userNew = userDao.findUserById(user.getId());
            if (userNew != null) {
                operations.set(key, userNew, 3, TimeUnit.HOURS);
            }
        }
        return result;
    }


}
