package com.neu.hospital.outpatientdoctor.dao;

import com.neu.hospital.outpatientdoctor.entity.HerbalTempDetailed;

import java.util.List;

public interface HerbalTempDetailedMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HerbalTempDetailed record);

    HerbalTempDetailed selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(HerbalTempDetailed record);

    List<HerbalTempDetailed> selectAll();

    List<HerbalTempDetailed> selectAll(HerbalTempDetailed herbalTempDetailed);
}