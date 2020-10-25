package com.neu.hospital.outpatientdoctor.service.impl;

import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;


import com.neu.hospital.outpatientdoctor.dao.PrescriptionDetailedMapper;
import com.neu.hospital.outpatientdoctor.entity.PrescriptionDetailed;
import com.neu.hospital.outpatientdoctor.service.PrescriptiondetailedService;


@Service("prescriptiondetailedService")
public class PrescriptiondetailedServiceImpl  implements PrescriptiondetailedService {

    @Autowired
    private PrescriptionDetailedMapper prescriptiondetailedMapper;

    /**
      * 分页查询
      * @param currPage
      * @return
      */
    @Override
    public PageInfo<PrescriptionDetailed> list(Integer currPage, PrescriptionDetailed prescriptiondetailed) {
        if(currPage == null) currPage = 1;
        PageHelper.startPage(currPage,5);
        PageInfo<PrescriptionDetailed> pageInfo = new PageInfo<>(prescriptiondetailedMapper.selectAll(prescriptiondetailed));
        return pageInfo;
    }

}