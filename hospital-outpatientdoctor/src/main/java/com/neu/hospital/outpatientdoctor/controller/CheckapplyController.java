package com.neu.hospital.outpatientdoctor.controller;

import com.github.pagehelper.PageInfo;
import com.neu.hospital.outpatientdoctor.entity.CheckApply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neu.hospital.outpatientdoctor.service.CheckapplyService;



/**
 * 
 *
 * @author wang
 * @email sunlightcs@gmail.com
 * @date 2020-09-07 20:42:16
 */
@RestController
@RequestMapping("/outpatientdoctor/checkapply")
public class CheckapplyController {
    @Autowired
    private CheckapplyService checkapplyService;

    /**
        * 分页查询
        *
        * @param currPage
        * @return
        */
    @RequestMapping("list/{currPage}")
    public PageInfo<CheckApply> list(@PathVariable Integer currPage, @RequestBody CheckApply checkapply) {
//        System.out.println(constantItem);
        return checkapplyService.list(currPage, checkapply);
    }


}
