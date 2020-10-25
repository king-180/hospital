package com.neu.hospital.outpatientdoctor.dao;

import com.neu.hospital.outpatientdoctor.entity.DrugsTemplate;

import java.util.List;

public interface DrugsTemplateMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DrugsTemplate record);

    DrugsTemplate selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(DrugsTemplate record);

    List<DrugsTemplate> selectAll();

    List<DrugsTemplate> selectAll(DrugsTemplate drugsTemplate);
}