package com.neu.hospital.outpatientregistration.dao;

import com.neu.hospital.outpatientregistration.entity.Registwork;
import java.util.List;

/**
 * 
 * 
 * @author wang
 * @email sunlightcs@gmail.com
 * @date 2020-09-07 20:42:15
 */
public interface RegistworkMapper  {
    List<Registwork> selectAll(Registwork registwork);
}
