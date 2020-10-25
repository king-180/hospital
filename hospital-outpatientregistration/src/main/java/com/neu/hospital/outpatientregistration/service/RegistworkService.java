package com.neu.hospital.outpatientregistration.service;
import com.github.pagehelper.PageInfo;
import com.neu.hospital.outpatientregistration.entity.Registwork;

/**
 * 
 *
 * @author wang
 * @email sunlightcs@gmail.com
 * @date 2020-09-07 20:42:15
 */
public interface RegistworkService  {

    PageInfo<Registwork> list(Integer currPage, Registwork registwork);

}

