package com.neu.hospital.outpatientdoctor.dao;

import com.neu.hospital.outpatientdoctor.entity.CheckRelation;

import java.util.List;

public interface CheckRelationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CheckRelation record);

    CheckRelation selectByPrimaryKey(Integer id);

    List<CheckRelation> selectAll();

    int updateByPrimaryKey(CheckRelation record);

    List<CheckRelation> selectAll(CheckRelation checkRelation);
}