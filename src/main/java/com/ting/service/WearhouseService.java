package com.ting.service;

import com.ting.pojo.Result;
import com.ting.pojo.Wearhouse;

import java.util.List;

/**
 * @Author 林雄
 */
public interface WearhouseService {
    //查询所有
    List<Wearhouse> selectAll();

    Result selectPark(Integer page, Integer limit);

    Result selectByParkName(String park_name);

    Result selectByPlate(String plate, Integer page, Integer limit);
}
