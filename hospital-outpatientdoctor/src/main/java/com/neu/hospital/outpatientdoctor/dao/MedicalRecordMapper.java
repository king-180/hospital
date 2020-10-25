package com.neu.hospital.outpatientdoctor.dao;

import com.neu.hospital.outpatientdoctor.entity.MedicalRecord;

import java.util.List;

public interface MedicalRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MedicalRecord record);

    MedicalRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(MedicalRecord record);

    List<MedicalRecord> selectAll();

    List<MedicalRecord> selectAll(MedicalRecord medicalRecord);
}