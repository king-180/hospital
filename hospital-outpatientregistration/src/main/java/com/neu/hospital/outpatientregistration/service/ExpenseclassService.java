package com.neu.hospital.outpatientregistration.service;

import com.github.pagehelper.PageInfo;
import com.neu.hospital.outpatientregistration.entity.Expenseclass;

/**
 * 
 *
 * @author wang
 * @email sunlightcs@gmail.com
 * @date 2020-09-07 20:42:16
 */
public interface ExpenseclassService  {

    PageInfo<Expenseclass> list(Integer currPage, Expenseclass expenseclass);

}

