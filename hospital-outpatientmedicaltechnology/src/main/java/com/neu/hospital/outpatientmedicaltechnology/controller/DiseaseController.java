package com.neu.hospital.outpatientmedicaltechnology.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neu.hospital.outpatientmedicaltechnology.entity.Disease;
import com.neu.hospital.outpatientmedicaltechnology.service.DiseaseService;

import javax.annotation.Resource;


/**
 * 
 *
 * @author wang
 * @email sunlightcs@gmail.com
 * @date 2020-09-07 20:42:16
 */
@RestController
@RequestMapping("/outpatientmedicaltechnology/disease")
public class DiseaseController {

    @Resource
    private DiseaseService diseaseService;

    /**
        * 分页查询
        *
        * @param currPage
        * @return
        */
    @RequestMapping("list/{currPage}")
    public PageInfo<Disease> list(@PathVariable Integer currPage, @RequestBody Disease disease) {
//        System.out.println(constantItem);
        return diseaseService.list(currPage, disease);
    }


}
