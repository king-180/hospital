package com.neu.hospital.outpatientpharmacy.controller;

import com.github.pagehelper.PageInfo;
import com.neu.hospital.outpatientpharmacy.entity.Drugs;
import com.neu.hospital.outpatientpharmacy.service.DrugsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 
 *
 * @author wang
 * @email sunlightcs@gmail.com
 * @date 2020-09-07 20:42:16
 */
@RestController
@RequestMapping("/outpatientpharmacy/drugs")
public class DrugsController {
    @Autowired
    private DrugsService drugsService;

    /**
        * 分页查询
        *
        * @param currPage
        * @return
        */
    @RequestMapping("list/{currPage}")
    public PageInfo<Drugs> list(@PathVariable Integer currPage, @RequestBody Drugs drugs) {
//        System.out.println(constantItem);
        return drugsService.list(currPage, drugs);
    }


}
