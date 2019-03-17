package com.lyg.ssm.service.impl;

import com.lyg.ssm.domain.User;
import com.lyg.ssm.mapper.IUserMapper;
import com.lyg.ssm.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserMapper userMapper;

    @Override
    public List<User> findAll() {

        return userMapper.findAll();
    }
}
