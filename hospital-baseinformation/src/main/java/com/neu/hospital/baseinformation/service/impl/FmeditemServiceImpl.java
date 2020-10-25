package com.neu.hospital.baseinformation.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neu.hospital.baseinformation.dao.FmedItemMapper;
import com.neu.hospital.baseinformation.entity.FmedItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.neu.hospital.baseinformation.service.FmeditemService;


@Service("fmeditemService")
public class FmeditemServiceImpl  implements FmeditemService {

    @Autowired
    private FmedItemMapper fmedItemMapper;

    /**
     * 分页查询
     * @param currPage
     * @return
     */
    @Override
    public PageInfo<FmedItem> list(Integer currPage, FmedItem fmedItem) {
        if(currPage == null) currPage = 1;
        PageHelper.startPage(currPage,5);
        PageInfo<FmedItem> pageInfo = new PageInfo<>(fmedItemMapper.selectAll(fmedItem));
        return pageInfo;
    }


}