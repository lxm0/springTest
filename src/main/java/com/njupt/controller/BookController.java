package com.njupt.controller;

import com.njupt.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @Override
    public String toString() {
        return "BookController{" +
                "bookService=" + bookService +
                '}';
    }
}
