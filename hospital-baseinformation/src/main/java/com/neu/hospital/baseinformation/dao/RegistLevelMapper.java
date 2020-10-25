package com.neu.hospital.baseinformation.dao;


import com.github.pagehelper.PageInfo;
import com.neu.hospital.baseinformation.entity.RegistLevel;

import java.util.List;

public interface RegistLevelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RegistLevel record);

    RegistLevel selectByPrimaryKey(Integer id);

    List<RegistLevel> selectAll();

    int updateByPrimaryKey(RegistLevel record);

    List<RegistLevel> selectAll(RegistLevel registLevel);
}