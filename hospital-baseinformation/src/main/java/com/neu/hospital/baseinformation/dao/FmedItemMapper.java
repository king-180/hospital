package com.neu.hospital.baseinformation.dao;

import com.neu.hospital.baseinformation.entity.FmedItem;

import java.util.List;

public interface FmedItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FmedItem record);

    FmedItem selectByPrimaryKey(Integer id);

    List<FmedItem> selectAll();

    int updateByPrimaryKey(FmedItem record);

    List<FmedItem> selectAll(FmedItem fmedItem);
}
