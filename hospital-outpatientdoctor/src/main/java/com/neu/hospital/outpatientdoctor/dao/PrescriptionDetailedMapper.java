package com.neu.hospital.outpatientdoctor.dao;

import com.neu.hospital.outpatientdoctor.entity.PrescriptionDetailed;

import java.util.List;

public interface PrescriptionDetailedMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PrescriptionDetailed record);

    PrescriptionDetailed selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(PrescriptionDetailed record);

    List<PrescriptionDetailed> selectAll();

    List<PrescriptionDetailed> selectAll(PrescriptionDetailed prescriptionDetailed);
}