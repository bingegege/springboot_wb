package com.wb.controller;

import com.wb.common.api.CommonPage;
import com.wb.common.api.CommonResult;
import com.wb.dao.UserDao;
import com.wb.domain.User;
import com.wb.mbg.model.PmsBrand;
import com.wb.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api(tags = "UserController", description = "redis用户测试")
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserDao userDao;

    @ApiOperation("查询所有")
    @RequestMapping(value = "/queryAll", method = RequestMethod.GET)
    @ResponseBody
    public List<User> queryAll(){
        List<User> lists = userService.queryAll();
        return lists;
    }

    @ApiOperation("查询通过id")
    @RequestMapping(value = "/findUserById", method = RequestMethod.GET)
    @ResponseBody
    public User findUserById(@RequestParam Integer id){
        User user = userService.findUserById(id);
//        System.out.println(user.getClass());
        return user;
    }

    @ApiOperation("更新用户")
    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateUser(@RequestBody User user){
        user.setBirthday(new Date());
        int result = userService.updateUser(user);
//        User userNew = userDao.findUserById(user.getId());
        if(result != 0){
            return CommonResult.success(result,"更新用户成功");
        }

        return CommonResult.failed("更新用户失败");
    }

    @ApiOperation("删除用户通过id")
    @RequestMapping(value = "/deleteUserById", method = RequestMethod.GET)
    @ResponseBody
    public String deleteUserById(@RequestParam Integer id){
        int result = userService.deleteUserById(id);
        if(result != 0){
            return "delete success";
        }
        return "delete fail";
    }

    @ApiOperation("添加用户")
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult addUser(@RequestBody User user){
        user.setBirthday(new Date());
        int result=userService.save(user);
        if(result!=0){
            return CommonResult.success(user.getId(),"添加用户成功");
        }else{
            return CommonResult.failed("添加用户失败");
        }
    }

    @ApiOperation("分页查询用户")
    @RequestMapping(value = "/findByPage", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<User>> findByPage(@RequestParam(value = "pageNum", defaultValue = "1")
                                                        @ApiParam("页码") Integer pageNum,
                                                        @RequestParam(value = "pageSize", defaultValue = "3")
                                                        @ApiParam("每页数量") Integer pageSize) {
        List<User> userList = userService.findByPage1(pageNum, pageSize);
//        System.out.println(userList.getClass());
        return CommonResult.success(CommonPage.restPage(userList));
    }
}

