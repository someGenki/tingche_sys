package com.ting.dao;

import com.ting.pojo.Parkinfo;

import java.util.List;

public interface ParkinfoMapper {
    int deleteByPrimaryKey(Integer parkId);

    int insert(Parkinfo record);

    Parkinfo selectByPrimaryKey(Integer parkId);

    List<Parkinfo> selectAll();

    int updateByPrimaryKey(Parkinfo record);
}