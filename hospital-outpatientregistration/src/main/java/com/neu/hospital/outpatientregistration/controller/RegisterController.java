package com.neu.hospital.outpatientregistration.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.neu.hospital.outpatientregistration.entity.Register;
import com.neu.hospital.outpatientregistration.service.RegisterService;
import javax.annotation.Resource;

/**
 * 
 *
 * @author wang
 * @email sunlightcs@gmail.com
 * @date 2020-09-07 20:42:16
 */
@RestController
@RequestMapping("/outpatientregistration/register")
public class RegisterController {
    @Resource
    private RegisterService registerService;

    /**
        * 分页查询
        *
        * @param currPage
        * @return
        */
    @RequestMapping("list/{currPage}")
    public PageInfo<Register> list(@PathVariable Integer currPage, @RequestBody Register register) {
//        System.out.println(constantItem);
        return registerService.list(currPage, register);
    }


}
