package com.neu.hospital.outpatientdoctor.dao;

import com.neu.hospital.outpatientdoctor.entity.HerbalDetailed;

import java.util.List;

public interface HerbalDetailedMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HerbalDetailed record);

    HerbalDetailed selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(HerbalDetailed record);

    List<HerbalDetailed> selectAll();

    List<HerbalDetailed> selectAll(HerbalDetailed herbalDetailed);
}