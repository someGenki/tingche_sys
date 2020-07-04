package com.ting.service;

import com.ting.pojo.Role;

import java.util.List;


public interface RoleService {
    //获取角色描述
    Role getRoleDescription(Integer rid);

    //分页查询角色
    List<Role> selectByPage(Integer page, Integer limit);

    //获取所有
    List<Role> all();

    //获取总条数
    int count();
}
