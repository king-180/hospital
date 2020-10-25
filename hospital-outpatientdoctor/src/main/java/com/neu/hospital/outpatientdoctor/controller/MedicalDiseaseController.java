package com.neu.hospital.outpatientdoctor.controller;

import com.github.pagehelper.PageInfo;
import com.neu.hospital.outpatientdoctor.entity.CheckRelation;
import com.neu.hospital.outpatientdoctor.entity.MedicalDisease;
import com.neu.hospital.outpatientdoctor.service.CheckrelationService;
import com.neu.hospital.outpatientdoctor.service.MedicaldiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/outpatientdoctor/medicaldisease")
public class MedicalDiseaseController {

    @Autowired
    private MedicaldiseaseService medicaldiseaseService;

    /**
     * 分页查询
     *
     * @param currPage
     * @return
     */
    @RequestMapping("list/{currPage}")
    public PageInfo<MedicalDisease> list(@PathVariable Integer currPage, @RequestBody MedicalDisease medicalDisease) {
//        System.out.println(constantItem);
        return medicaldiseaseService.list(currPage, medicalDisease);
    }


}
