package com.ting.service;

import com.ting.pojo.User;

import java.util.List;

public interface UserService {

    //求总数
    int count();

    //创建用户
    boolean createUser(User u);

    List<User> selectByPage(Integer page, Integer limit);

    //更新用户状态
    void updateStatus(int status, int uid);

    //更新用户密码
    void updatePassword(String password, int uid);

    //根据用户名查询是否重复
    int getByUsername(String username);

    //更新用户角色
    String updateRole(int rid, int uid, int op_uid);
}
