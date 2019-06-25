package com.njupt.config;

import com.njupt.bean.Red;
import com.njupt.dao.BookDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.njupt.service","com.njupt.controller","com.njupt.dao"})
public class MainConfigAutoWired {
    @Bean("bookDao2")
    public BookDao bookDao(){
        BookDao bookDao = new BookDao();
        bookDao.setValue("2");
        return bookDao;
    }
    @Bean
    public Red red(){
        return new Red();
    }
}
