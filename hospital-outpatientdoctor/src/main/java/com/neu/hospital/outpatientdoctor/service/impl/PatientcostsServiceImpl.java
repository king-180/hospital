package com.neu.hospital.outpatientdoctor.service.impl;

import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;


import com.neu.hospital.outpatientdoctor.dao.PatientCostsMapper;
import com.neu.hospital.outpatientdoctor.entity.PatientCosts;
import com.neu.hospital.outpatientdoctor.service.PatientcostsService;


@Service("patientcostsService")
public class PatientcostsServiceImpl  implements PatientcostsService {

    @Autowired
    private PatientCostsMapper patientcostsMapper;

    /**
      * 分页查询
      * @param currPage
      * @return
      */
    @Override
    public PageInfo<PatientCosts> list(Integer currPage, PatientCosts patientcosts) {
        if(currPage == null) currPage = 1;
        PageHelper.startPage(currPage,5);
        PageInfo<PatientCosts> pageInfo = new PageInfo<>(patientcostsMapper.selectAll(patientcosts));
        return pageInfo;
    }

}