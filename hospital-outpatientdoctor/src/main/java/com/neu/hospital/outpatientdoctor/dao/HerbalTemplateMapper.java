package com.neu.hospital.outpatientdoctor.dao;

import com.neu.hospital.outpatientdoctor.entity.HerbalTemplate;

import java.util.List;

public interface HerbalTemplateMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HerbalTemplate record);

    HerbalTemplate selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(HerbalTemplate record);

    List<HerbalTemplate> selectAll();

    List<HerbalTemplate> selectAll(HerbalTemplate herbalTemplate);
}