package com.neu.hospital.baseinformation.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neu.hospital.baseinformation.dao.UserMapper;
import com.neu.hospital.baseinformation.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.neu.hospital.baseinformation.service.UserService;



@Service("userService")
public class UserServiceImpl   implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public PageInfo<User> list(Integer currPage, User user) {
        if(currPage == null) currPage = 1;
        PageHelper.startPage(currPage,5);
        PageInfo<User> pageInfo = new PageInfo<>(userMapper.selectAll(user));
        return pageInfo;
    }
}