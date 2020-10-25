package com.neu.hospital.baseinformation.controller;

import com.neu.hospital.baseinformation.entity.DepartName;
import com.neu.hospital.baseinformation.service.DepartNameService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/baseinformation/departname")
public class DepartNameController {

    @Resource
    private DepartNameService departNameService;

    @RequestMapping("list")
    public List<DepartName> getList() {
        return departNameService.selectAll();

    }

}
