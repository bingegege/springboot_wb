package com.wb.service;

import com.wb.domain.User;

import java.util.List;

public interface UserService {
    List<User> queryAll();

    User findUserById(int id);

    int deleteUserById(int id);

    int updateUser(User user);

    int save(User user);

    List<User> findByPage(int pageNum, int pageSize);

    List<User> findByPage1(int pageNum, int pageSize);

}
