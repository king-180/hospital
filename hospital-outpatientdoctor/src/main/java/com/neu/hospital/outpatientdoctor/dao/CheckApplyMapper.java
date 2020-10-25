package com.neu.hospital.outpatientdoctor.dao;

import com.neu.hospital.outpatientdoctor.entity.CheckApply;

import java.util.List;

public interface CheckApplyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CheckApply record);

    CheckApply selectByPrimaryKey(Integer id);

    List<CheckApply> selectAll();

    int updateByPrimaryKey(CheckApply record);

    List<CheckApply> selectAll(CheckApply checkApply);
}