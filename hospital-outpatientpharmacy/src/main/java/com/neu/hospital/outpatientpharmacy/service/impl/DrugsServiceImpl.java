package com.neu.hospital.outpatientpharmacy.service.impl;

import com.neu.hospital.outpatientpharmacy.dao.DrugsMapper;
import com.neu.hospital.outpatientpharmacy.entity.Drugs;
import com.neu.hospital.outpatientpharmacy.service.DrugsService;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

@Service("drugsService")
public class DrugsServiceImpl  implements DrugsService {

    @Autowired
    private DrugsMapper drugsMapper;

    /**
      * 分页查询
      * @param currPage
      * @return
      */
    @Override
    public PageInfo<Drugs> list(Integer currPage, Drugs drugs) {
        if(currPage == null) currPage = 1;
        PageHelper.startPage(currPage,5);
        PageInfo<Drugs> pageInfo = new PageInfo<>(drugsMapper.selectAll(drugs));
        return pageInfo;
    }

}