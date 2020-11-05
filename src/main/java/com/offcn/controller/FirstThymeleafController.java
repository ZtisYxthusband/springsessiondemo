package com.offcn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * <p>title:com.offcn.controller</p>
 * <p>ClassName:FirstThymeleafController</p>
 * author:小点点
 * date:2020/11/5
 * version:1.0
 */
@Controller
public class FirstThymeleafController {
    @GetMapping("/first")
    public String indexPage(Model model) {
        String message = "Hello, Thymeleaf!";
        model.addAttribute("message", message);
        return "index";
    }
}


