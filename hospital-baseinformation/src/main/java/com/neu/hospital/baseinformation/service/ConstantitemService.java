package com.neu.hospital.baseinformation.service;

import com.github.pagehelper.PageInfo;
import com.neu.hospital.baseinformation.entity.ConstantItem;

/**
 *
 * @author wang
 * @email sunlightcs@gmail.com
 * @date 2020-09-05 23:47:37
 */
public interface ConstantitemService {

    ConstantItem selById(Integer id);

    PageInfo<ConstantItem> list(Integer currPage, ConstantItem constantItem);

    ConstantItem update(ConstantItem constantItem);

    PageInfo<ConstantItem> selAll(Integer currPage, ConstantItem constantItem);

    void del(Integer id);

    void add(ConstantItem constantItem);
}

