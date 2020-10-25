package com.neu.hospital.outpatientdoctor.dao;

import com.neu.hospital.outpatientdoctor.entity.Prescription;
import com.neu.hospital.outpatientdoctor.entity.PrescriptionDetailed;

import java.util.List;

public interface PrescriptionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Prescription record);

    Prescription selectByPrimaryKey(Integer id);

    List<Prescription> selectAll();

    int updateByPrimaryKey(Prescription record);

    List<Prescription> selectAll(Prescription prescription);
}