package com.neu.hospital.outpatientdoctor.dao;


import com.neu.hospital.outpatientdoctor.entity.MedicalDisease;

import java.util.List;


public interface MedicalDiseaseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MedicalDisease record);

    MedicalDisease selectByPrimaryKey(Integer id);

    List<MedicalDisease> selectAll();

    int updateByPrimaryKey(MedicalDisease record);

    List<MedicalDisease> selectAll(MedicalDisease medicalDisease);
}