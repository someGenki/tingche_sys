package com.ting.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ting.pojo.User;
import com.ting.service.UserService;
import com.ting.utils.ToJsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * 用户功能
 *
 * @Author:卢元庆
 */
@RequestMapping("/user")
@Controller
public class UserController {

    @Autowired
    UserService service;

    /**
     * 创建一个用户,也要判断权限
     *
     * @param user 用户对象
     * @return 操作是否成功
     */
    @RequestMapping("/create")
    public String createUser(User user) {
        user.setGmtCreate(new Date());
        service.createUser(user);
        return "home";
    }

    /**
     * 判断用户名是否重复
     *
     * @param username
     * @return
     * @throws JsonProcessingException
     */
    @GetMapping("/exist/{username}")
    @ResponseBody
    public String isExist(@PathVariable String username) throws JsonProcessingException {
        if (service.getByUsername(username) > 0)
            return ToJsonUtil.reJson(1, "用户名重复", null);
        else
            return ToJsonUtil.reJson(0, "用户名未重复，可以使用", null);
    }

    /**
     * 通过更用户id来更新用户状态
     * tingche/user/update-status?status=1&uid=1
     *
     * @param status 0冻结1启用
     * @param uid    用户id(user_id)
     * @return
     */
    @RequestMapping("/update-status")
    @ResponseBody
    public String updateStatus(int uid, int status) {
        service.updateStatus(status, uid);
        return "ok";
    }

    /**
     * 分页查询用户信息
     *
     * @param page
     * @param limit
     * @return
     * @throws JsonProcessingException
     */
    @ResponseBody
    @RequestMapping("/all")
    public String page(Integer page, Integer limit) throws JsonProcessingException {
        List<User> users = service.selectByPage(page, limit);
        int count = service.count();
        return ToJsonUtil.reJson(0, count, "成功", users);

    }

    /**
     * 修改用户密码 可能用不上
     *
     * @param password 密码
     * @param uid      用户id
     * @return
     */
    @RequestMapping("/update-password")
    @ResponseBody
    public String updateUser(String password, int uid) {
        service.updatePassword(password, uid);
        return "ok";
    }

    /**
     * 更新用户所拥有的角色
     *
     * @param uid
     * @param rid
     * @return
     */
    public String updateRole(int uid, int rid) {
        //先不搞
        return "ok";
    }

}
