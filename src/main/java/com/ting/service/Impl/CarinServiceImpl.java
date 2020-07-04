package com.ting.service.Impl;

import com.ting.dao.CarinUserMapper;
import com.ting.pojo.CarinUser;
import com.ting.service.CarinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarinServiceImpl implements CarinService {

    @Autowired
    CarinUserMapper mapper;

    @Override
    public boolean createCarin(CarinUser ci) {
        int insert = mapper.insert(ci);
        return true;
    }

    @Override
    public void add(Integer pid) {
        mapper.addOne(pid);
    }
}
