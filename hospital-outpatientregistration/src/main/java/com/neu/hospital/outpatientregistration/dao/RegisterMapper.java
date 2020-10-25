package com.neu.hospital.outpatientregistration.dao;

import com.neu.hospital.outpatientregistration.entity.Register;
import com.neu.hospital.outpatientregistration.entity.Registwork;

import java.util.List;

/**
 * 
 * 
 * @author wang
 * @email sunlightcs@gmail.com
 * @date 2020-09-07 20:42:16
 */
public interface RegisterMapper  {
    List<Register> selectAll(Register register);
}
