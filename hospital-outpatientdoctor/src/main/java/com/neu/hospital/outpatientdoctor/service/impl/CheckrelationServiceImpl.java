package com.neu.hospital.outpatientdoctor.service.impl;

import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;


import com.neu.hospital.outpatientdoctor.dao.CheckRelationMapper;
import com.neu.hospital.outpatientdoctor.entity.CheckRelation;
import com.neu.hospital.outpatientdoctor.service.CheckrelationService;


@Service("checkrelationService")
public class CheckrelationServiceImpl  implements CheckrelationService {

    @Autowired
    private CheckRelationMapper checkrelationMapper;

    /**
      * 分页查询
      * @param currPage
      * @return
      */
    @Override
    public PageInfo<CheckRelation> list(Integer currPage, CheckRelation checkrelation) {
        if(currPage == null) currPage = 1;
        PageHelper.startPage(currPage,5);
        PageInfo<CheckRelation> pageInfo = new PageInfo<>(checkrelationMapper.selectAll(checkrelation));
        return pageInfo;
    }

}