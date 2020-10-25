package com.neu.hospital.baseinformation.dao;

import com.neu.hospital.baseinformation.entity.ConstantItem;

import java.util.List;

public interface ConstantItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ConstantItem constantItem);

    ConstantItem selectByPrimaryKey(Integer id);

    List<ConstantItem> selectAll(ConstantItem constantItem);

    int updateByPrimaryKey(ConstantItem id);
}