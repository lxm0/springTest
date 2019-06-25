package com.njupt.service;

import com.njupt.dao.BookDao;
import com.njupt.mapper.GroupMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookService {
    @Autowired
    GroupMapper userInfoMapper;
    @Autowired
    private BookDao bookDao;

    public void print(){
        System.out.println(bookDao);

    }

    @Override
    public String toString() {
        return "BookService{" +
                "bookDao=" + bookDao +
                '}';
    }
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public int updateName(){

        userInfoMapper.updatename("bbb");
        return  1;
    }
}
