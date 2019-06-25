package com.njupt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/Session")
public class SessionController {
    @RequestMapping("/test1")
    public String test01(HttpServletRequest request, HttpSession httpSession){

        request.setAttribute("req","req的值");
        HttpSession session = request.getSession();
        session.setAttribute("Session","Session的值");
        ServletContext application = request.getServletContext();
        application.setAttribute("application","application的值");
        return "success";
    }
}
