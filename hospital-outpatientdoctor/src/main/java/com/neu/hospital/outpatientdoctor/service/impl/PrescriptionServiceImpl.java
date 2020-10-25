package com.neu.hospital.outpatientdoctor.service.impl;

import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;


import com.neu.hospital.outpatientdoctor.dao.PrescriptionMapper;
import com.neu.hospital.outpatientdoctor.entity.Prescription;
import com.neu.hospital.outpatientdoctor.service.PrescriptionService;


@Service("prescriptionService")
public class PrescriptionServiceImpl  implements PrescriptionService {

    @Autowired
    private PrescriptionMapper prescriptionMapper;

    /**
      * 分页查询
      * @param currPage
      * @return
      */
    @Override
    public PageInfo<Prescription> list(Integer currPage, Prescription prescription) {
        if(currPage == null) currPage = 1;
        PageHelper.startPage(currPage,5);
        PageInfo<Prescription> pageInfo = new PageInfo<>(prescriptionMapper.selectAll(prescription));
        return pageInfo;
    }

}