package com.neu.hospital.outpatientregistration.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neu.hospital.outpatientregistration.entity.Registwork;
import com.neu.hospital.outpatientregistration.service.RegistworkService;



/**
 * 
 *
 * @author wang
 * @email sunlightcs@gmail.com
 * @date 2020-09-07 20:42:15
 */
@RestController
@RequestMapping("/outpatientregistration/registwork")
public class RegistworkController {
    @Autowired
    private RegistworkService registworkService;

    /**
        * 分页查询
        *
        * @param currPage
        * @return
        */
    @RequestMapping("list/{currPage}")
    public PageInfo<Registwork> list(@PathVariable Integer currPage, @RequestBody Registwork registwork) {
//        System.out.println(constantItem);
        return registworkService.list(currPage, registwork);
    }


}
