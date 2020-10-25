package com.neu.hospital.outpatientmedicaltechnology.service;
import com.github.pagehelper.PageInfo;
import com.neu.hospital.outpatientmedicaltechnology.entity.Disease;

/**
 * 
 *
 * @author wang
 * @email sunlightcs@gmail.com
 * @date 2020-09-07 20:42:16
 */
public interface DiseaseService  {

    PageInfo<Disease> list(Integer currPage, Disease disease);

}

