package com.neu.hospital.outpatientpharmacy.dao;

import com.neu.hospital.outpatientpharmacy.entity.Drugs;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 
 * 
 * @author wang
 * @email sunlightcs@gmail.com
 * @date 2020-09-07 20:42:16
 */
@Mapper
public interface DrugsMapper  {
    List<Drugs> selectAll(Drugs drugs);
}
