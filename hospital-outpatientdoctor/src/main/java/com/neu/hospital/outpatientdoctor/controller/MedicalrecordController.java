package com.neu.hospital.outpatientdoctor.controller;

import java.util.Arrays;
import java.util.Map;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neu.hospital.outpatientdoctor.entity.MedicalRecord;
import com.neu.hospital.outpatientdoctor.service.MedicalrecordService;



/**
 * 
 *
 * @author wang
 * @email sunlightcs@gmail.com
 * @date 2020-09-07 20:42:16
 */
@RestController
@RequestMapping("/outpatientdoctor/medicalrecord")
public class MedicalrecordController {
    @Autowired
    private MedicalrecordService medicalrecordService;

    /**
        * 分页查询
        *
        * @param currPage
        * @return
        */
    @RequestMapping("list/{currPage}")
    public PageInfo<MedicalRecord> list(@PathVariable Integer currPage, @RequestBody MedicalRecord medicalrecord) {
//        System.out.println(constantItem);
        return medicalrecordService.list(currPage, medicalrecord);
    }


}
