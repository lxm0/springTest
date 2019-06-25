package com.njupt.mapper;

import com.njupt.pojo.UserInfo;
import org.apache.ibatis.annotations.Select;

public interface UserInfoMapper {
    @Select("select * from user_inf where id = #{id}")
    UserInfo getUserinfo(Integer id);
}
