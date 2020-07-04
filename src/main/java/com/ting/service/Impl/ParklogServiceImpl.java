package com.ting.service.Impl;

import com.ting.dao.BusLogMapper;
import com.ting.entity.BusDto;
import com.ting.entity.Result;
import com.ting.service.ParklogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 孙菊红
 */
@Service
public class ParklogServiceImpl implements ParklogService {
    @Autowired
    private BusLogMapper busLogMapper;

    @Override
    public Result selectByTypeOrName(String id, String useid, Integer page, Integer limit) {
        page = (page - 1) * 10;
        List<BusDto> list = busLogMapper.selectByTypeOrName(id, useid, page, limit);
        Result result = new Result();
        result.setData(list);
        result.setCount(10L);
        return result;
    }


    /**
     * 组长改
     *
     * @return
     */
    @Override
    public Result seAll() {
        List<BusDto> list = busLogMapper.selectAll();
        Result result = new Result();
        result.setData(list);
        result.setCount(10L);
        return result;
    }

    @Override
    public List<BusDto> selectAll() {

        //调用dao获取数据，可能会对数据进行处理，处理后再返回。

        List<BusDto> list = busLogMapper.selectAll();
        return list;
    }
}
