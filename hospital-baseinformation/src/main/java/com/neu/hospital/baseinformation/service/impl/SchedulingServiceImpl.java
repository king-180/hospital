package com.neu.hospital.baseinformation.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neu.hospital.baseinformation.dao.SchedulingMapper;
import com.neu.hospital.baseinformation.entity.Scheduling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.neu.hospital.baseinformation.service.SchedulingService;

import javax.annotation.Resource;


@Service("schedulingService")
public class SchedulingServiceImpl  implements SchedulingService {

    @Resource
    private SchedulingMapper schedulingMapper;

    /**
     * 分页查询
     * @param currPage
     * @return
     */
    @Override
    public PageInfo<Scheduling> list(Integer currPage, Scheduling scheduling) {
        if(currPage == null) currPage = 1;
        PageHelper.startPage(currPage,5);
        PageInfo<Scheduling> pageInfo = new PageInfo<>(schedulingMapper.selectAll(scheduling));
        return pageInfo;
    }

}