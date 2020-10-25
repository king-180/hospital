package com.neu.hospital.baseinformation.service;


import com.github.pagehelper.PageInfo;
import com.neu.hospital.baseinformation.entity.User;


/**
 * 
 *
 * @author wang
 * @email sunlightcs@gmail.com
 * @date 2020-09-05 23:47:37
 */
public interface UserService  {

    PageInfo<User> list(Integer currPage, User user);
}

