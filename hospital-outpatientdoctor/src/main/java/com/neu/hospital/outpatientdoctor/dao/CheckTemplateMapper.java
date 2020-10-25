package com.neu.hospital.outpatientdoctor.dao;

import com.neu.hospital.outpatientdoctor.entity.CheckTemplate;

import java.util.List;

public interface CheckTemplateMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CheckTemplate record);

    CheckTemplate selectByPrimaryKey(Integer id);

    List<CheckTemplate> selectAll();

    List<CheckTemplate> selectAll(CheckTemplate checkTemplate);

    int updateByPrimaryKey(CheckTemplate record);
}