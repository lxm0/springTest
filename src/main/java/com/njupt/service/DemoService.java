package com.njupt.service;

import com.njupt.mapper.GroupMapper;
import com.njupt.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DemoService {
    @Autowired
    GroupMapper userInfoMapper;
    @Autowired
    BookService bookService;
    @Transactional
    public UserInfo getUserInfo(){
        bookService.updateName();
        getUserInfo2();
        return  userInfoMapper.select(2);
    }
    @Transactional(propagation = Propagation.REQUIRED)
    public UserInfo getUserInfo2(){
        UserInfo id= userInfoMapper.select(11);
        return  userInfoMapper.select(id.getId());
    }
//    @Transactional(propagation = Propagation.REQUIRES_NEW)
//    public int updateName(){
//
//        userInfoMapper.updatename("zzz");
//        return  1;
//    }
}
