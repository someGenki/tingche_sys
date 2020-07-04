package com.ting.service.Impl;

import com.ting.dao.WearhouseMapper;
import com.ting.pojo.Park;
import com.ting.pojo.Result;
import com.ting.pojo.Wearhouse;
import com.ting.service.WearhouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 林雄
 */
@Service
public class WearhouseServiceImpl implements WearhouseService {


    @Autowired
    private WearhouseMapper wearhouseMapper;
    @Override
    public List<Wearhouse> selectAll() {
        List<Wearhouse> list = wearhouseMapper.selectAll();
        return list;
    }

    @Override
    public Result selectPark(Integer page, Integer limit) {

        page = (page - 1)*limit;
        List<Park> list2 = wearhouseMapper.selectPark(page, limit);
        Long count = wearhouseMapper.getCount();
        Result result = new Result();
        result.setCount(count);
        result.setData(list2);
        return result;
    }

    @Override
    public Result selectByParkName(String park_name) {
        List<Wearhouse> list = wearhouseMapper.selectByParkName(park_name);
        Result result = new Result();
        result.setData(list);
        return result;
    }

    @Override
    public Result selectByPlate(String plate, Integer page, Integer limit) {
        page = (page - 1)*limit;
        List<Park> list = wearhouseMapper.selectByPlate(plate, page, limit);
        Result result = new Result();
        result.setCount(10L);
        result.setData(list);
        return result;
    }
}
