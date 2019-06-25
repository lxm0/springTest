package com.njupt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InterceptorController {
    @RequestMapping("/demo1")
    public String demo(){
        System.out.println("demo");
        return "success";
    }
}
