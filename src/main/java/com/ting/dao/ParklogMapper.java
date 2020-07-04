package com.ting.dao;

import com.ting.pojo.Parklog;

import java.util.List;

public interface ParklogMapper {
    int deleteByPrimaryKey(Integer logId);

    int insert(Parklog record);

    Parklog selectByPrimaryKey(Integer logId);

    int updateByPrimaryKey(Parklog record);

    List<Parklog> selectAll();
}