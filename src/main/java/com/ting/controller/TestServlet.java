package com.ting.controller;

import com.ting.dao.RoleMapper;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;

// “返璞归真”
@WebServlet("/test")
public class TestServlet extends javax.servlet.http.HttpServlet {
    @Override
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("test");
        response.sendRedirect("https://www.baidu.com");
        RoleMapper mapper;
    }


    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        this.doPost(request, response);
    }
}
