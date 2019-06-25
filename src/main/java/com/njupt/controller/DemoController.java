package com.njupt.controller;

import com.njupt.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class DemoController  {

    @Autowired
    BookService bookService;

    @RequestMapping("test")
    public String test(String name){
        System.out.println(name);
        bookService.print();
        return "success";
    }
    @RequestMapping("test2")
    public String test2(String name, @RequestParam(value = "list") ArrayList list){
        System.out.println(name);
        System.out.println(list);
        bookService.print();
        return "success";
    }
    @RequestMapping("test3")
    public String test3(String name){
        System.out.println(name);
        return "success";
    }
    @RequestMapping(value = "test4",method = RequestMethod.POST)
    @ResponseBody
    public String test4( String name){
        System.out.println("Post");
        System.out.println(name);
        return "Post "+name;
    }
    @RequestMapping(value = "test4/{name}",method = RequestMethod.GET)
    @ResponseBody
    public String test5(@PathVariable String name){
        System.out.println("Get");
        System.out.println(name);
        return "Get "+name;
    }
    @RequestMapping(value = "test4/{name}",method = RequestMethod.PUT)
    @ResponseBody
    public String test6(@PathVariable String name){
        System.out.println("Put");
        System.out.println(name);
        return "Put "+name;
    }
    @RequestMapping(value = "test4/{name}",method = RequestMethod.DELETE)
    @ResponseBody
    public String test7(@PathVariable String name){
        System.out.println("DELETE");
        System.out.println(name);
        return "DELETE "+name;
    }
}
