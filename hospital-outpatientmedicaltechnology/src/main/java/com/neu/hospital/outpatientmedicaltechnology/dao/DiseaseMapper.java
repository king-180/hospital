package com.neu.hospital.outpatientmedicaltechnology.dao;

import com.neu.hospital.outpatientmedicaltechnology.entity.Disease;
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
public interface DiseaseMapper  {

    List<Disease> selectAll(Disease disease);
}
