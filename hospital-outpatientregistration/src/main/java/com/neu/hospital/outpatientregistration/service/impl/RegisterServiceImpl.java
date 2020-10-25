package com.neu.hospital.outpatientregistration.service.impl;

import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


import com.neu.hospital.outpatientregistration.dao.RegisterMapper;
import com.neu.hospital.outpatientregistration.entity.Register;
import com.neu.hospital.outpatientregistration.service.RegisterService;

import javax.annotation.Resource;


@Service("registerService")
public class RegisterServiceImpl  implements RegisterService {

    @Resource
    private RegisterMapper registerMapper;

    /**
      * 分页查询
      * @param currPage
      * @return
      */
    @Override
    public PageInfo<Register> list(Integer currPage, Register register) {
        if(currPage == null) currPage = 1;
        PageHelper.startPage(currPage,5);
        PageInfo<Register> pageInfo = new PageInfo<>(registerMapper.selectAll(register));
        return pageInfo;
    }

}