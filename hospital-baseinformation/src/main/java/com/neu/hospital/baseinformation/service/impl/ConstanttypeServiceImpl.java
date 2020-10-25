package com.neu.hospital.baseinformation.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neu.hospital.baseinformation.dao.ConstantTypeMapper;
import com.neu.hospital.baseinformation.entity.ConstantType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.neu.hospital.baseinformation.service.ConstanttypeService;


@Service("constanttypeService")
public class ConstanttypeServiceImpl  implements ConstanttypeService {

    @Autowired
    private ConstantTypeMapper constantTypeMapper;

//    @Override
//    public PageInfo<ConstantType> list(Integer currPage, ConstantType constantType) {
//        if(currPage == null) currPage = 1;
//        PageHelper.startPage(currPage,5);
//        PageInfo<ConstantType> pageInfo = new PageInfo<>(constantTypeMapper.selectAll(constantType));
//        return pageInfo;
//    }
}