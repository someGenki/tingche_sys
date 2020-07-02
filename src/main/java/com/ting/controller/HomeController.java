package com.ting.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ting.dao.ParkinfoMapper;
import com.ting.pojo.Parkinfo;
import com.ting.utils.ToJsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 主页跳转功能
 */
@Controller
@RequestMapping("/home")
public class HomeController {
    @Autowired
    ParkinfoMapper mapper;

    /**
     * 跳转到index.html
     *
     * @return 给视图解析器
     */
    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    /**
     * 获取车库信息
     *
     * @return
     * @throws JsonProcessingException
     */
    @RequestMapping("/info")
    @ResponseBody
    public String getInfo() throws JsonProcessingException {
        Parkinfo p = mapper.selectByPrimaryKey(1);
        return ToJsonUtil.reJson(p);
    }
}
