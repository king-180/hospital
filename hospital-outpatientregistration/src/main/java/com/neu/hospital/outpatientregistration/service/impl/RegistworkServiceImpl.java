package com.neu.hospital.outpatientregistration.service.impl;

import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;


import com.neu.hospital.outpatientregistration.dao.RegistworkMapper;
import com.neu.hospital.outpatientregistration.entity.Registwork;
import com.neu.hospital.outpatientregistration.service.RegistworkService;


@Service("registworkService")
public class RegistworkServiceImpl  implements RegistworkService {

    @Autowired
    private RegistworkMapper registworkMapper;

    /**
      * 分页查询
      * @param currPage
      * @return
      */
    @Override
    public PageInfo<Registwork> list(Integer currPage, Registwork registwork) {
        if(currPage == null) currPage = 1;
        PageHelper.startPage(currPage,5);
        PageInfo<Registwork> pageInfo = new PageInfo<>(registworkMapper.selectAll(registwork));
        return pageInfo;
    }

}