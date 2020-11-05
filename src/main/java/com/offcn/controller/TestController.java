package com.offcn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * <p>title:com.offcn.controller</p>
 * <p>ClassName:TestController</p>
 * author:小点点
 * date:2020/11/5
 * version:1.0
 */
@RestController
public class TestController {
    @GetMapping("/set")
    public String setSession(HttpSession session){
        session.setAttribute("msg","hellow");
        return "ok";
    }
    @GetMapping("/get")
    public String getSession(HttpSession session){
        return (String)session.getAttribute("msg");
    }

}
