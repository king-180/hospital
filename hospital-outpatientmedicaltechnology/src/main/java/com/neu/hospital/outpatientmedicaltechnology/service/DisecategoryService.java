package com.neu.hospital.outpatientmedicaltechnology.service;
import com.github.pagehelper.PageInfo;
import com.neu.hospital.outpatientmedicaltechnology.entity.Disecategory;

/**
 * 
 *
 * @author wang
 * @email sunlightcs@gmail.com
 * @date 2020-09-07 20:42:16
 */
public interface DisecategoryService  {

    PageInfo<Disecategory> list(Integer currPage, Disecategory disecategory);

}

