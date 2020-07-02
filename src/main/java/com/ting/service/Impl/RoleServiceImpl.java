package com.ting.service.Impl;

import com.ting.dao.RoleMapper;
import com.ting.pojo.Role;
import com.ting.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    // Unsatisfied dependency expressed through field 'service';

    @Autowired
    RoleMapper mapper;


    @Override
    public Role getRoleDescription(Integer rid) {
        return mapper.selectByPrimaryKey(rid);
    }

    @Override
    public List<Role> selectByPage(Integer page, Integer limit) {
        page = (page - 1) * limit;
        return mapper.page(page, limit);
    }

    @Override
    public List<Role> all() {
        return mapper.selectAll();
    }

    @Override
    public int count() {
        return mapper.getCount();
    }
}
