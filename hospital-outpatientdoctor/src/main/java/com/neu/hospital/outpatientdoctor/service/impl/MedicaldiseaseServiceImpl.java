package com.neu.hospital.outpatientdoctor.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neu.hospital.outpatientdoctor.dao.HerbalTemplateMapper;
import com.neu.hospital.outpatientdoctor.dao.MedicalDiseaseMapper;
import com.neu.hospital.outpatientdoctor.entity.HerbalTemplate;
import com.neu.hospital.outpatientdoctor.entity.MedicalDisease;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.neu.hospital.outpatientdoctor.service.MedicaldiseaseService;


@Service("medicaldiseaseService")
public class MedicaldiseaseServiceImpl  implements MedicaldiseaseService {

    @Autowired
    private MedicalDiseaseMapper medicalDiseaseMapper;

    /**
     * 分页查询
     * @param currPage
     * @return
     */
    @Override
    public PageInfo<MedicalDisease> list(Integer currPage, MedicalDisease medicalDisease) {
        if(currPage == null) currPage = 1;
        PageHelper.startPage(currPage,5);
        PageInfo<MedicalDisease> pageInfo = new PageInfo<>(medicalDiseaseMapper.selectAll(medicalDisease));
        return pageInfo;
    }

}