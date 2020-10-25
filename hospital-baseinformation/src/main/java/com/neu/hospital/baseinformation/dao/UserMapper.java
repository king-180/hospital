package com.neu.hospital.baseinformation.dao;


import com.github.pagehelper.PageInfo;
import com.neu.hospital.baseinformation.entity.User;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User selectByPrimaryKey(Integer id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);

    List<User> selectAll(User user);
}