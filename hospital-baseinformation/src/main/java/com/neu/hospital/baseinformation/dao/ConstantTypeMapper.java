package com.neu.hospital.baseinformation.dao;


import com.github.pagehelper.PageInfo;
import com.neu.hospital.baseinformation.entity.ConstantType;

import java.util.List;

public interface ConstantTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ConstantType record);

    ConstantType selectByPrimaryKey(Integer id);

    List<ConstantType> selectAll();

    int updateByPrimaryKey(ConstantType record);

    PageInfo<ConstantType> selectAll(ConstantType constantType);
}