package com.neu.hospital.outpatientdoctor.service;


import com.github.pagehelper.PageInfo;
import com.neu.hospital.outpatientdoctor.entity.MedicalDisease;

/**
 * 
 *
 * @author wang
 * @email sunlightcs@gmail.com
 * @date 2020-09-05 23:47:37
 */
public interface MedicaldiseaseService {

    PageInfo<MedicalDisease> list(Integer currPage, MedicalDisease medicalDisease);

}

