package com.neu.hospital.outpatientmedicaltechnology.service.impl;

import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;


import com.neu.hospital.outpatientmedicaltechnology.dao.DisecategoryMapper;
import com.neu.hospital.outpatientmedicaltechnology.entity.Disecategory;
import com.neu.hospital.outpatientmedicaltechnology.service.DisecategoryService;


@Service("disecategoryService")
public class DisecategoryServiceImpl  implements DisecategoryService {

    @Autowired
    private DisecategoryMapper disecategoryMapper;

    /**
      * 分页查询
      * @param currPage
      * @return
      */
    @Override
    public PageInfo<Disecategory> list(Integer currPage, Disecategory disecategory) {
        if(currPage == null) currPage = 1;
        PageHelper.startPage(currPage,5);
        PageInfo<Disecategory> pageInfo = new PageInfo<>(disecategoryMapper.selectAll(disecategory));
        return pageInfo;
    }

}