package com.neu.hospital.baseinformation.dao;

import com.neu.hospital.baseinformation.entity.Scheduling;

import java.util.List;

public interface SchedulingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Scheduling record);

    Scheduling selectByPrimaryKey(Integer id);

    List<Scheduling> selectAll();

    int updateByPrimaryKey(Scheduling record);

    List<Scheduling> selectAll(Scheduling scheduling);

}