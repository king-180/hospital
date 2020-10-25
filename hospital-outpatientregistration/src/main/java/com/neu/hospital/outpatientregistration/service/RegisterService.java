package com.neu.hospital.outpatientregistration.service;
import com.github.pagehelper.PageInfo;
import com.neu.hospital.outpatientregistration.entity.Register;

/**
 * 
 *
 * @author wang
 * @email sunlightcs@gmail.com
 * @date 2020-09-07 20:42:16
 */
public interface RegisterService  {

    PageInfo<Register> list(Integer currPage, Register register);

}

