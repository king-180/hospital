package com.neu.hospital.outpatientdoctor.dao;

import com.neu.hospital.outpatientdoctor.entity.HerbalPrescription;

import java.util.List;

public interface HerbalPrescriptionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HerbalPrescription record);

    HerbalPrescription selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(HerbalPrescription record);

    List<HerbalPrescription> selectAll();

    List<HerbalPrescription> selectAll(HerbalPrescription herbalPrescription);
}