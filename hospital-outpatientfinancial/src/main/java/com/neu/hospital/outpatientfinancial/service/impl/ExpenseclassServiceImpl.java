package com.neu.hospital.outpatientfinancial.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neu.hospital.outpatientfinancial.dao.ExpenseclassMapper;
import com.neu.hospital.outpatientfinancial.entity.Expenseclass;
import com.neu.hospital.outpatientfinancial.service.ExpenseclassService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service("expenseclassService")
public class ExpenseclassServiceImpl implements ExpenseclassService {

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