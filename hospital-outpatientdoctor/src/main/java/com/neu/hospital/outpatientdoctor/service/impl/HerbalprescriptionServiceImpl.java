package com.neu.hospital.outpatientdoctor.service.impl;

import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;


import com.neu.hospital.outpatientdoctor.dao.HerbalPrescriptionMapper;
import com.neu.hospital.outpatientdoctor.entity.HerbalPrescription;
import com.neu.hospital.outpatientdoctor.service.HerbalprescriptionService;


@Service("herbalprescriptionService")
public class HerbalprescriptionServiceImpl  implements HerbalprescriptionService {

    @Autowired
    private HerbalPrescriptionMapper herbalprescriptionMapper;

    /**
      * 分页查询
      * @param currPage
      * @return
      */
    @Override
    public PageInfo<HerbalPrescription> list(Integer currPage, HerbalPrescription herbalprescription) {
        if(currPage == null) currPage = 1;
        PageHelper.startPage(currPage,5);
        PageInfo<HerbalPrescription> pageInfo = new PageInfo<>(herbalprescriptionMapper.selectAll(herbalprescription));
        return pageInfo;
    }

}