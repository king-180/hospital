package com.neu.hospital.baseinformation.controller;

import com.github.pagehelper.PageInfo;
import com.neu.hospital.baseinformation.entity.User;
import com.neu.hospital.baseinformation.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/baseinformation/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("say")
    public String say() {
        return "hello";
    }

    /**
     * 分页查询
     * @param currPage
     * @return
     */
    @RequestMapping("list/{currPage}")
    public PageInfo<User> list(@PathVariable Integer currPage, @RequestBody User user){
//        System.out.println(constantItem);
        return userService.list(currPage, user);
    }




}
