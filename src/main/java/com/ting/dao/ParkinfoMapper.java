package com.ting.dao;

import com.ting.pojo.Parkinfo;
import org.apache.ibatis.annotations.Update;

import java.util.List;


public interface ParkinfoMapper {
    int deleteByPrimaryKey(Integer parkId);

    int insert(Parkinfo record);

    Parkinfo selectByPrimaryKey(Integer parkId);

    List<Parkinfo> selectAll();

    int updateByPrimaryKey(Parkinfo record);

    @Update("update parkinfo set current_use=current_use-1 where park_id=#{pid};")
    int subOne(Integer pid);
}