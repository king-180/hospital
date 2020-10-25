package com.neu.hospital.outpatientdoctor.service.impl;

import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;


import com.neu.hospital.outpatientdoctor.dao.HerbalDetailedMapper;
import com.neu.hospital.outpatientdoctor.entity.HerbalDetailed;
import com.neu.hospital.outpatientdoctor.service.HerbaldetailedService;


@Service("herbaldetailedService")
public class HerbaldetailedServiceImpl  implements HerbaldetailedService {

    @Autowired
    private HerbalDetailedMapper herbaldetailedMapper;

    /**
      * 分页查询
      * @param currPage
      * @return
      */
    @Override
    public PageInfo<HerbalDetailed> list(Integer currPage, HerbalDetailed herbaldetailed) {
        if(currPage == null) currPage = 1;
        PageHelper.startPage(currPage,5);
        PageInfo<HerbalDetailed> pageInfo = new PageInfo<>(herbaldetailedMapper.selectAll(herbaldetailed));
        return pageInfo;
    }

}