package com.neu.hospital.outpatientpharmacy.service;
import com.github.pagehelper.PageInfo;
import com.neu.hospital.outpatientpharmacy.entity.Drugsdetailed;

/**
 * 
 *
 * @author wang
 * @email sunlightcs@gmail.com
 * @date 2020-09-07 20:42:16
 */
public interface DrugsdetailedService  {

    PageInfo<Drugsdetailed> list(Integer currPage, Drugsdetailed drugsdetailed);

}

