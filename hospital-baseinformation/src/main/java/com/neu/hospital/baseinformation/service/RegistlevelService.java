package com.neu.hospital.baseinformation.service;


import com.github.pagehelper.PageInfo;
import com.neu.hospital.baseinformation.entity.RegistLevel;

/**
 * 
 *
 * @author wang
 * @email sunlightcs@gmail.com
 * @date 2020-09-05 23:47:37
 */
public interface RegistlevelService  {

    PageInfo<RegistLevel> list(Integer currPage, RegistLevel registLevel);
}

