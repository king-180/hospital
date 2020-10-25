package com.neu.hospital.baseinformation.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neu.hospital.baseinformation.dao.RegistLevelMapper;
import com.neu.hospital.baseinformation.entity.RegistLevel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.neu.hospital.baseinformation.service.RegistlevelService;


@Service("registlevelService")
public class RegistlevelServiceImpl  implements RegistlevelService {

    @Autowired
    private RegistLevelMapper registLevelMapper;

    @Override
    public PageInfo<RegistLevel> list(Integer currPage, RegistLevel registLevel) {
        if(currPage == null) currPage = 1;
        PageHelper.startPage(currPage,5);
        PageInfo<RegistLevel> pageInfo = new PageInfo<>(registLevelMapper.selectAll(registLevel));
        return pageInfo;
    }
}