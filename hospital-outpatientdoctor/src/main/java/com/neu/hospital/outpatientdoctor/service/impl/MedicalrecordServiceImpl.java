package com.neu.hospital.outpatientdoctor.service.impl;

import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;


import com.neu.hospital.outpatientdoctor.dao.MedicalRecordMapper;
import com.neu.hospital.outpatientdoctor.entity.MedicalRecord;
import com.neu.hospital.outpatientdoctor.service.MedicalrecordService;


@Service("medicalrecordService")
public class MedicalrecordServiceImpl  implements MedicalrecordService {

    @Autowired
    private MedicalRecordMapper medicalrecordMapper;

    /**
      * 分页查询
      * @param currPage
      * @return
      */
    @Override
    public PageInfo<MedicalRecord> list(Integer currPage, MedicalRecord medicalrecord) {
        if(currPage == null) currPage = 1;
        PageHelper.startPage(currPage,5);
        PageInfo<MedicalRecord> pageInfo = new PageInfo<>(medicalrecordMapper.selectAll(medicalrecord));
        return pageInfo;
    }

}