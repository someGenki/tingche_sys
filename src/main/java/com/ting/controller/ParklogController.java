package com.ting.controller;


import com.ting.entity.BusDto;
import com.ting.entity.Result;
import com.ting.service.ParklogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 车辆出入库日志
 *
 * @author 孙菊红
 */
//获取所有车出库和入库信息

@Controller
@RequestMapping("/parklog")//便于寻找
public class ParklogController {

    @Autowired
    private ParklogService busLogservice;

    //查询操作
    @RequestMapping("/selectAll")
    @ResponseBody   //自动将数据转换成json格式
    public Result selectAll() {
        if (false) {
            //调用服务层，将数据按照要求返回给前端
            List<BusDto> list = busLogservice.selectAll();
            Result result = new Result();
            result.setCode(0);
            result.setMsg("success");
            result.setData(list);
            //json
            return result;
        }
        Result result = busLogservice.seAll();
        return result;
    }

    @RequestMapping("/selectByTypeOrName")
    @ResponseBody
    public Result selectByTypeOrName(String id, String useid, Integer page, Integer limit) {
        Result result = busLogservice.selectByTypeOrName(id, useid, page, limit);
        return result;
    }

}
