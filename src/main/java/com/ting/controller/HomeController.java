package com.ting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 主页跳转功能
 */
@Controller
@RequestMapping("/home")
public class HomeController {
    /**
     * 跳转到index.html
     *
     * @return 给视图解析器
     */
    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
