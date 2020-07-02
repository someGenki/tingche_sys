package com.ting.dao;

import com.ting.pojo.CarinUser;

import java.util.List;

public interface CarinUserMapper {
    int deleteByPrimaryKey(Integer rkId);

    int insert(CarinUser record);

    CarinUser selectByPrimaryKey(Integer rkId);

    List<CarinUser> selectAll();

    int updateByPrimaryKey(CarinUser record);
}