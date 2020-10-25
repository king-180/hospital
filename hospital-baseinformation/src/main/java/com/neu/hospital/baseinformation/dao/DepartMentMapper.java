package com.neu.hospital.baseinformation.dao;


import com.github.pagehelper.PageInfo;
import com.neu.hospital.baseinformation.entity.DepartMent;

import java.util.List;

public interface DepartMentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DepartMent record);

    DepartMent selectByPrimaryKey(Integer id);

    List<DepartMent> selectAll(DepartMent departMent);

    int updateByPrimaryKey(DepartMent record);
}