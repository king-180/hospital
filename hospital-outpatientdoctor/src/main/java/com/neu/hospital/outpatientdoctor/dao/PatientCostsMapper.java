package com.neu.hospital.outpatientdoctor.dao;

import com.neu.hospital.outpatientdoctor.entity.PatientCosts;

import java.util.List;

public interface PatientCostsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PatientCosts record);

    PatientCosts selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(PatientCosts record);

    List<PatientCosts> selectAll();

    List<PatientCosts> selectAll(PatientCosts patientCosts);
}