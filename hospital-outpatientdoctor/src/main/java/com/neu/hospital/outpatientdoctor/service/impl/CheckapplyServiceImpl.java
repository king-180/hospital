package com.neu.hospital.outpatientdoctor.service.impl;

import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;


import com.neu.hospital.outpatientdoctor.dao.CheckApplyMapper;
import com.neu.hospital.outpatientdoctor.entity.CheckApply;
import com.neu.hospital.outpatientdoctor.service.CheckapplyService;


@Service("checkapplyService")
public class CheckapplyServiceImpl  implements CheckapplyService {

    @Autowired
    private CheckApplyMapper checkapplyMapper;

    /**
      * 分页查询
      * @param currPage
      * @return
      */
    @Override
    public PageInfo<CheckApply> list(Integer currPage, CheckApply checkapply) {
        if(currPage == null) currPage = 1;
        PageHelper.startPage(currPage,5);
        PageInfo<CheckApply> pageInfo = new PageInfo<>(checkapplyMapper.selectAll(checkapply));
        return pageInfo;
    }

}