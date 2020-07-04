package com.ting.controller;

import com.ting.pojo.CarinDto;
import com.ting.pojo.CarinUser;
import com.ting.pojo.Parklog;
import com.ting.pojo.Result;
import com.ting.service.TollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;


/**
 * @Author 谢川东
 */
@Controller
@RequestMapping("/toll")
public class TollController {

    @Autowired
    private TollService tollService;

    @RequestMapping("/selectAll")
    @ResponseBody   //自动将我们的数据转换成json格式
    public Result selectAll(Integer page, Integer limit) {
        //实现查询操作
        Result result = tollService.selectAll(page, limit);
        return result;
    }

    @RequestMapping("/selectByIDorPlate")
    @ResponseBody
    public Result selectByIDorPlate(String userId, String plate, Integer page, Integer limit) {
        Result result = tollService.selectByIDorPlate(userId, plate, page, limit);
        return result;
    }

    @ResponseBody
    @RequestMapping("/carout")
    public Result carout(Integer rid) {
        Result log = tollService.createLog(rid);
        return log;
    }

}
