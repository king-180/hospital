package com.neu.hospital.outpatientdoctor.service;
import com.github.pagehelper.PageInfo;
import com.neu.hospital.outpatientdoctor.entity.MedicalRecord;

/**
 * 
 *
 * @author wang
 * @email sunlightcs@gmail.com
 * @date 2020-09-07 20:42:16
 */
public interface MedicalrecordService  {

    PageInfo<MedicalRecord> list(Integer currPage, MedicalRecord medicalrecord);

}

