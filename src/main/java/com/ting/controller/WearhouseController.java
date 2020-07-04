package com.ting.controller;


import com.ting.pojo.Result;
import com.ting.pojo.Wearhouse;
import com.ting.service.WearhouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * 车库管理模块
 *
 * @Author 林雄
 */
@Controller
@RequestMapping("/wearhouse")
public class WearhouseController {

    @Autowired
    private WearhouseService wearhouseService;

    //查询所有车库的信息
    @ResponseBody
    @RequestMapping("/selectAll")
    public Result selectAll() {
        List<Wearhouse> list = wearhouseService.selectAll();
        Result result = new Result();
        result.setData(list);
        return result;
    }

    //查询一个车库的具体信息
    @ResponseBody
    @RequestMapping("/selectPark")
    public Result selectPark(Integer page, Integer limit) {
        Result result = wearhouseService.selectPark(page, limit);
        return result;
    }

    @ResponseBody
    @RequestMapping("/selectByParkName")
    public Result selectByParkName(HttpServletRequest req, String park_name) throws UnsupportedEncodingException {
        System.out.println("park_name:" + park_name);
        park_name = park_name.trim();
        Result result = wearhouseService.selectByParkName(park_name);
        return result;
    }

    @ResponseBody
    @RequestMapping("/selectByPlate")
    public Result selectByPlate(String plate, Integer page, Integer limit) {
        Result result = wearhouseService.selectByPlate(plate, page, limit);
        return result;
    }
}
