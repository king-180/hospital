package com.neu.hospital.outpatientmedicaltechnology.service.impl;

import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.neu.hospital.outpatientmedicaltechnology.dao.DiseaseMapper;
import com.neu.hospital.outpatientmedicaltechnology.entity.Disease;
import com.neu.hospital.outpatientmedicaltechnology.service.DiseaseService;

import javax.annotation.Resource;


@Service("diseaseService")
public class DiseaseServiceImpl  implements DiseaseService {

    @Resource
    private DiseaseMapper diseaseMapper;

    /**
      * 分页查询
      * @param currPage
      * @return
      */
    @Override
    public PageInfo<Disease> list(Integer currPage, Disease disease) {
        if(currPage == null) currPage = 1;
        PageHelper.startPage(currPage,5);
        PageInfo<Disease> pageInfo = new PageInfo<>(diseaseMapper.selectAll(disease));
        return pageInfo;
    }

}