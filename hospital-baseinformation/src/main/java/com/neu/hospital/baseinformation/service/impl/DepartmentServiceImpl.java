package com.neu.hospital.baseinformation.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neu.hospital.baseinformation.dao.DepartMentMapper;
import com.neu.hospital.baseinformation.entity.ConstantItem;
import com.neu.hospital.baseinformation.entity.DepartMent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.neu.hospital.baseinformation.service.DepartmentService;


@Service("departmentService")
public class DepartmentServiceImpl  implements DepartmentService {

    @Autowired
    private DepartMentMapper departMentMapper;
    /**
     * 分页查询
     * @param currPage
     * @return
     */
    @Override
    public PageInfo<DepartMent> list(Integer currPage, DepartMent departMent) {
        if(currPage == null) currPage = 1;
        PageHelper.startPage(currPage,5);
        PageInfo<DepartMent> pageInfo = new PageInfo<>(departMentMapper.selectAll(departMent));
        return pageInfo;
    }
}