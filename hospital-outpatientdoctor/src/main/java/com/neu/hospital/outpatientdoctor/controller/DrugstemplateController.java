package com.neu.hospital.outpatientdoctor.controller;

import java.util.Arrays;
import java.util.Map;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neu.hospital.outpatientdoctor.entity.DrugsTemplate;
import com.neu.hospital.outpatientdoctor.service.DrugstemplateService;



/**
 * 
 *
 * @author wang
 * @email sunlightcs@gmail.com
 * @date 2020-09-07 20:42:16
 */
@RestController
@RequestMapping("/outpatientdoctor/drugstemplate")
public class DrugstemplateController {
    @Autowired
    private DrugstemplateService drugstemplateService;

    /**
        * 分页查询
        *
        * @param currPage
        * @return
        */
    @RequestMapping("list/{currPage}")
    public PageInfo<DrugsTemplate> list(@PathVariable Integer currPage, @RequestBody DrugsTemplate drugstemplate) {
//        System.out.println(constantItem);
        return drugstemplateService.list(currPage, drugstemplate);
    }


}
