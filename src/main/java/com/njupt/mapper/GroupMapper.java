package com.njupt.mapper;

import com.njupt.pojo.UserInfo;
import org.apache.ibatis.annotations.Param;

public interface GroupMapper {

    UserInfo select(@Param("id")int id);
    UserInfo selectByname(String name);
    UserInfo test(UserInfo userInfo);
    UserInfo testbind(String name);
    int updatename(String name);
}
