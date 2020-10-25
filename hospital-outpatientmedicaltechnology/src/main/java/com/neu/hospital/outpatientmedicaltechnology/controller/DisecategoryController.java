package com.neu.hospital.outpatientmedicaltechnology.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neu.hospital.outpatientmedicaltechnology.entity.Disecategory;
import com.neu.hospital.outpatientmedicaltechnology.service.DisecategoryService;



/**
 * 
 *
 * @author wang
 * @email sunlightcs@gmail.com
 * @date 2020-09-07 20:42:16
 */
@RestController
@RequestMapping("/outpatientmedicaltechnology/disecategory")
public class DisecategoryController {

    @Autowired
    private DisecategoryService disecategoryService;

    /**
        * 分页查询
        *
        * @param currPage
        * @return
        */
    @RequestMapping("list/{currPage}")
    public PageInfo<Disecategory> list(@PathVariable Integer currPage, @RequestBody Disecategory disecategory) {
//        System.out.println(constantItem);
        return disecategoryService.list(currPage, disecategory);
    }


}
