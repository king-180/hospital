package com.neu.hospital.baseinformation.service.impl;

import com.neu.hospital.baseinformation.dao.DepartNameMapper;
import com.neu.hospital.baseinformation.entity.DepartName;
import com.neu.hospital.baseinformation.service.DepartNameService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("departNameService")
public class DepartNameServiceImpl implements DepartNameService {

    @Resource
    private DepartNameMapper departNameMapper;

    @Override
    public List<DepartName> selectAll() {
        return departNameMapper.selectAll();
    }
}
