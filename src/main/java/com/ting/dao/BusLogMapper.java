package com.ting.dao;

import com.ting.entity.BusDto;
import com.ting.entity.BusLog;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BusLogMapper {
    int deleteByPrimaryKey(Integer logId);

    int insert(BusDto record);

    BusLog selectByPrimaryKey(Integer logId);

    List<BusDto> selectAll();

    int updateByPrimaryKey(BusDto record);

    // List<BusDto> selectdto();

    List<BusDto> selectByTypeOrName(@Param("id") String id, @Param("useid") String useid, @Param("page") Integer page, @Param("limit") Integer limit);
}