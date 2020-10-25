package com.neu.hospital.outpatientdoctor.service.impl;

import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;


import com.neu.hospital.outpatientdoctor.dao.CheckTemplateMapper;
import com.neu.hospital.outpatientdoctor.entity.CheckTemplate;
import com.neu.hospital.outpatientdoctor.service.ChecktemplateService;


@Service("checktemplateService")
public class ChecktemplateServiceImpl  implements ChecktemplateService {

    @Autowired
    private CheckTemplateMapper checktemplateMapper;

    /**
      * 分页查询
      * @param currPage
      * @return
      */
    @Override
    public PageInfo<CheckTemplate> list(Integer currPage, CheckTemplate checktemplate) {
        if(currPage == null) currPage = 1;
        PageHelper.startPage(currPage,5);
        PageInfo<CheckTemplate> pageInfo = new PageInfo<>(checktemplateMapper.selectAll(checktemplate));
        return pageInfo;
    }

}