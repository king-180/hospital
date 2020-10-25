package com.neu.hospital.outpatientregistration.service.impl;

import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;


import com.neu.hospital.outpatientregistration.dao.ExpenseclassMapper;
import com.neu.hospital.outpatientregistration.entity.Expenseclass;
import com.neu.hospital.outpatientregistration.service.ExpenseclassService;

import javax.annotation.Resource;


@Service("expenseclassService")
public class ExpenseclassServiceImpl  implements ExpenseclassService {

    @Resource
    private ExpenseclassMapper expenseclassMapper;

    /**
      * 分页查询
      * @param currPage
      * @return
      */
    @Override
    public PageInfo<Expenseclass> list(Integer currPage, Expenseclass expenseclass) {
        if(currPage == null) currPage = 1;
        PageHelper.startPage(currPage,5);
        PageInfo<Expenseclass> pageInfo = new PageInfo<>(expenseclassMapper.selectAll(expenseclass));
        return pageInfo;
    }

}