package com.ting.service;

import com.ting.pojo.Role;

import java.util.List;


public interface RoleService {
    Role getRoleDescription(Integer rid);

    List<Role> selectByPage(Integer page, Integer limit);

    List<Role> all();

    int count();
}
