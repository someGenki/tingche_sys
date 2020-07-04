package com.ting.dao;

import com.ting.pojo.Park;
import com.ting.pojo.Wearhouse;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author 林雄
 */
public interface WearhouseMapper {
    List<Wearhouse> selectAll();

    List<Park> selectPark(@Param("page") Integer page, @Param("limit") Integer limit);

    Long getCount();

    List<Wearhouse> selectByParkName(@Param("park_name") String park_name);

    List<Park> selectByPlate(@Param("plate")String plate, @Param("page") Integer page, @Param("limit") Integer limit);
}
