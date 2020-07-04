package com.ting.service.Impl;


import com.ting.dao.CarinUserMapper;
import com.ting.dao.ParkinfoMapper;
import com.ting.dao.ParklogMapper;
import com.ting.pojo.*;
import com.ting.service.TollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Author 谢川东
 */
@Service
public class TollServiceImpl implements TollService {

    @Autowired
    private CarinUserMapper carinUserMapper;

    @Autowired
    private ParklogMapper parklogMapper;

    @Autowired
    private ParkinfoMapper parkinfoMapper;

    @Override
    public Result selectAll(Integer page, Integer limit) {
        //做业务逻辑判断
        //去调用dao获取数据
        //可能会对数据进行处理
        //先找到所有未出库车辆
        //将page转化为sql语句中需要的数据
        page = (page - 1) * limit;
        List<TollDto> list = carinUserMapper.selectAll1(page, limit);
        Long count = carinUserMapper.getCount();
        Result result = new Result();
        result.setCount(count);
        result.setData(list);
        return result;
    }

    @Override
    public Result selectByIDorPlate(String userId, String plate, Integer page, Integer limit) {
        page = (page - 1) * limit;
        List<TollDto> list = carinUserMapper.selectByIDorPlate(userId, plate, page, limit);
        Result result = new Result();
        result.setData(list);
        Long count = carinUserMapper.getCount();
        result.setCount(count);
        return result;
    }

    @Override
    public Result createLog(Integer rid) {
        CarinUser c = carinUserMapper.selectByPrimaryKey(rid);
        System.out.println(c);
        Date d = new Date();
        long time = d.getTime();
        long total = time - c.getRkTime().getTime();
        System.out.println(total / 60000 + " 分钟");
        //算价格
        float cost = (float) (total / 60000.0 * (5.0 / 60.0));//每小时5元
        System.out.println(cost);
        //封装成一条日志
        Parklog p = new Parklog();
        p.setUserId(c.getUserId());
        p.setParkId(1);//先默认1
        p.setPlate(c.getRkPlate());
        p.setRinTime(c.getRkTime());
        p.setOutTime(d);
        p.setCost(((float) (Math.round(cost * 100)) / 100));
        System.out.println(p);
        parklogMapper.insert(p);
        parkinfoMapper.subOne(1);
        Result result = new Result();
        result.setData(null);
        result.setMsg("共花费" + p.getCost() + " 元.总计时长(min):" + total / 60000);
        result.setCode(0);
        return result;
    }
}
