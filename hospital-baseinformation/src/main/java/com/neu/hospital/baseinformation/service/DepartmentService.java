package com.neu.hospital.baseinformation.service;


import com.github.pagehelper.PageInfo;
import com.neu.hospital.baseinformation.entity.DepartMent;

/**
 * 
 *
 * @author wang
 * @email sunlightcs@gmail.com
 * @date 2020-09-05 23:47:37
 */
public interface DepartmentService  {

    PageInfo<DepartMent> list(Integer currPage, DepartMent departMent);
}

