package com.ting.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ting.pojo.CarinUser;
import com.ting.pojo.Parkinfo;
import com.ting.service.CarinService;
import com.ting.service.ParkinfoService;
import com.ting.utils.ToJsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * 车辆入库
 *
 * @Author 李沅泽
 */
@Controller
@RequestMapping("/carin")
public class CarinController {

    @Autowired
    ParkinfoService parkinfoService;
    @Autowired
    CarinService carinService;

    @RequestMapping("/in")
    public String createCarin(CarinUser carin) {
        carin.setRkTime(new Date());
        System.out.println(carin);
        carinService.createCarin(carin);
        carinService.add(1);//给1号车库加一
        return "home";
    }


    @ResponseBody
    @RequestMapping("/pki")
    public String isFull(Integer pid) throws JsonProcessingException {
        Parkinfo parkInfo = parkinfoService.getParkInfo(pid);
        System.out.println(parkInfo);
        if (parkInfo.getCurrentUse() + 1 <= parkInfo.getUsableCapacity())
            return ToJsonUtil.reJson(1, "有车位", null);
        else
            return ToJsonUtil.reJson(0, "车位已满", null);
    }


}
