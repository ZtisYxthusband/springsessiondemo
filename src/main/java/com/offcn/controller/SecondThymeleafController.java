package com.offcn.controller;

import com.offcn.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>title:com.offcn.controller</p>
 * <p>ClassName:SecondThymeleafController</p>
 * author:小点点
 * date:2020/11/5
 * version:1.0
 */
@Controller
public class SecondThymeleafController {
    @GetMapping("/second")
    public String indexPage(Model model){
        String message = "Hello, Thymeleaf!";
        User user=new User();
        user.setId(1);
        user.setAge(11);
        user.setName("xiaowang");
        Map<String,Object> map=new HashMap<>();
        map.put("src1","1jpg");
        map.put("src2","2jpg");
        model.addAttribute("message",message);
        model.addAttribute("user", user);
        model.addAttribute("src", map);
        return  "index2";
    }
}
