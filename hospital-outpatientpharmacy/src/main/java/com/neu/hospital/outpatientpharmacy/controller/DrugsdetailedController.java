package com.neu.hospital.outpatientpharmacy.controller;

import com.github.pagehelper.PageInfo;
import com.neu.hospital.outpatientpharmacy.entity.Drugsdetailed;
import com.neu.hospital.outpatientpharmacy.service.DrugsdetailedService;
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
@RequestMapping("/outpatientpharmacy/drugsdetailed")
public class DrugsdetailedController {
    @Autowired
    private DrugsdetailedService drugsdetailedService;

    /**
        * 分页查询
        *
        * @param currPage
        * @return
        */
    @RequestMapping("list/{currPage}")
    public PageInfo<Drugsdetailed> list(@PathVariable Integer currPage, @RequestBody Drugsdetailed drugsdetailed) {
//        System.out.println(constantItem);
        return drugsdetailedService.list(currPage, drugsdetailed);
    }


}
