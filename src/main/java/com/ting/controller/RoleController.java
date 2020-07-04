package com.ting.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ting.pojo.Role;
import com.ting.service.RoleService;
import com.ting.utils.ToJsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 用户角色功能
 *
 * @Author 卢元庆
 */
@Controller
@RequestMapping("/role")
public class RoleController {

    @Autowired
    RoleService service;

    /**
     * 获取一个角色信息
     * restful风格 复习
     *
     * @param rid rid
     * @return
     */
    @ResponseBody
    @RequestMapping("/info/{rid}")
    public String getOne(@PathVariable int rid) throws JsonProcessingException {
        Role r = service.getRoleDescription(rid);
        return ToJsonUtil.reJson(r);
    }

    /**
     * 分页查询角色信息 学习用
     *
     * @param page
     * @param limit
     * @return
     * @throws JsonProcessingException
     */
    @ResponseBody
    @RequestMapping("/all")
    //用Inter避免空指针异常
    public String all(Integer page, Integer limit) throws JsonProcessingException {
        List<Role> roles = service.selectByPage(page, limit);

        int count = service.count();
        return ToJsonUtil.reJson(0, count, "成功", roles);
    }

}
