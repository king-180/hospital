package com.neu.hospital.outpatientdoctor.service.impl;

import com.neu.hospital.outpatientdoctor.dao.DrugsTemplateMapper;
import com.neu.hospital.outpatientdoctor.entity.DrugsTemplate;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;


import com.neu.hospital.outpatientdoctor.service.DrugstemplateService;


@Service("drugstemplateService")
public class DrugstemplateServiceImpl  implements DrugstemplateService {

    @Autowired
    private DrugsTemplateMapper drugstemplateMapper;

    /**
      * 分页查询
      * @param currPage
      * @return
      */
    @Override
    public PageInfo<DrugsTemplate> list(Integer currPage, DrugsTemplate drugstemplate) {
        if(currPage == null) currPage = 1;
        PageHelper.startPage(currPage,5);
        PageInfo<DrugsTemplate> pageInfo = new PageInfo<>(drugstemplateMapper.selectAll(drugstemplate));
        return pageInfo;
    }

}