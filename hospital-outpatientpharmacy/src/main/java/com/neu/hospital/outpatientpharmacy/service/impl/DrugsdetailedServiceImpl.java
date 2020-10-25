package com.neu.hospital.outpatientpharmacy.service.impl;

import com.neu.hospital.outpatientpharmacy.dao.DrugsdetailedMapper;
import com.neu.hospital.outpatientpharmacy.entity.Drugsdetailed;
import com.neu.hospital.outpatientpharmacy.service.DrugsdetailedService;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

@Service("drugsdetailedService")
public class DrugsdetailedServiceImpl  implements DrugsdetailedService {

    @Autowired
    private DrugsdetailedMapper drugsdetailedMapper;

    /**
      * 分页查询
      * @param currPage
      * @return
      */
    @Override
    public PageInfo<Drugsdetailed> list(Integer currPage, Drugsdetailed drugsdetailed) {
        if(currPage == null) currPage = 1;
        PageHelper.startPage(currPage,5);
        PageInfo<Drugsdetailed> pageInfo = new PageInfo<>(drugsdetailedMapper.selectAll(drugsdetailed));
        return pageInfo;
    }

}