package com.wb.dao;

import com.wb.domain.User;
import com.wb.mbg.model.FivegManagers;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserDao {
    //用户列表
    @Select("select * from t_user")
    @Results({
            @Result(property = "userName",column = "user_name"),
            @Result(property = "passWord",column = "pass_word")
    })
    List<User> queryAll();

    //根据id获取user
    @Select("select * from t_user where id =#{id}")
    @Results({
            @Result(property = "userName",column = "user_name"),
            @Result(property = "passWord",column = "pass_word")
    })
    User findUserById(Integer id);

    //根据id修改user
    @Update("update t_user set user_name=#{userName},pass_word =#{passWord},sex=#{sex},birthday=#{birthday} WHERE id = #{id} ")
    int updateUser(User user);

    //根据id删除用户
    @Delete("delete from t_user where id = #{id}")
    int deleteUserById(Integer id);

    //添加用户
    @Insert("insert into t_user(user_name,pass_word,sex,birthday) values(#{userName},#{passWord},#{sex},#{birthday})")
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")
    int save(User user);

    //分页查询用户
    @Select("select * from t_user")
    @Results({
            @Result(property = "userName",column = "user_name"),
            @Result(property = "passWord",column = "pass_word")
    })
    List<User> findByPage();
}
