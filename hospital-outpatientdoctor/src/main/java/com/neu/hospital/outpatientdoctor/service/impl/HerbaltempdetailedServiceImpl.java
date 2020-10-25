package com.neu.hospital.outpatientdoctor.service.impl;

import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;


import com.neu.hospital.outpatientdoctor.dao.HerbalTempDetailedMapper;
import com.neu.hospital.outpatientdoctor.entity.HerbalTempDetailed;
import com.neu.hospital.outpatientdoctor.service.HerbaltempdetailedService;


@Service("herbaltempdetailedService")
public class HerbaltempdetailedServiceImpl  implements HerbaltempdetailedService {

    @Autowired
    private HerbalTempDetailedMapper herbaltempdetailedMapper;

    /**
      * 分页查询
      * @param currPage
      * @return
      */
    @Override
    public PageInfo<HerbalTempDetailed> list(Integer currPage, HerbalTempDetailed herbaltempdetailed) {
        if(currPage == null) currPage = 1;
        PageHelper.startPage(currPage,5);
        PageInfo<HerbalTempDetailed> pageInfo = new PageInfo<>(herbaltempdetailedMapper.selectAll(herbaltempdetailed));
        return pageInfo;
    }

}