package com.neu.hospital.outpatientdoctor.service.impl;

import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;


import com.neu.hospital.outpatientdoctor.dao.HerbalTemplateMapper;
import com.neu.hospital.outpatientdoctor.entity.HerbalTemplate;
import com.neu.hospital.outpatientdoctor.service.HerbaltemplateService;


@Service("herbaltemplateService")
public class HerbaltemplateServiceImpl  implements HerbaltemplateService {

    @Autowired
    private HerbalTemplateMapper herbaltemplateMapper;

    /**
      * 分页查询
      * @param currPage
      * @return
      */
    @Override
    public PageInfo<HerbalTemplate> list(Integer currPage, HerbalTemplate herbaltemplate) {
        if(currPage == null) currPage = 1;
        PageHelper.startPage(currPage,5);
        PageInfo<HerbalTemplate> pageInfo = new PageInfo<>(herbaltemplateMapper.selectAll(herbaltemplate));
        return pageInfo;
    }

}