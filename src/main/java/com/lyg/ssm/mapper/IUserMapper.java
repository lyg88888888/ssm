package com.lyg.ssm.mapper;

import com.lyg.ssm.domain.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userMapper")
public interface IUserMapper {

    @Select("select * from user")
    List<User> findAll();


}
