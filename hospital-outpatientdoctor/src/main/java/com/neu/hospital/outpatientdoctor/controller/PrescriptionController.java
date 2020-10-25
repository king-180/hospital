package com.neu.hospital.outpatientdoctor.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neu.hospital.outpatientdoctor.entity.Prescription;
import com.neu.hospital.outpatientdoctor.service.PrescriptionService;



/**
 * 
 *
 * @author wang
 * @email sunlightcs@gmail.com
 * @date 2020-09-07 20:42:16
 */
@RestController
@RequestMapping("/outpatientdoctor/prescription")
public class PrescriptionController {
    @Autowired
    private PrescriptionService prescriptionService;

    /**
        * 分页查询
        *
        * @param currPage
        * @return
        */
    @RequestMapping("list/{currPage}")
    public PageInfo<Prescription> list(@PathVariable Integer currPage, @RequestBody Prescription prescription) {
//        System.out.println(constantItem);
        return prescriptionService.list(currPage, prescription);
    }


}
