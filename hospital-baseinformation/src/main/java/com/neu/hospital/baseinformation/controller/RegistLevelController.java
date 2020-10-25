package com.neu.hospital.baseinformation.controller;

import com.github.pagehelper.PageInfo;
import com.neu.hospital.baseinformation.entity.ConstantItem;
import com.neu.hospital.baseinformation.entity.RegistLevel;
import com.neu.hospital.baseinformation.service.RegistlevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/baseinformation/registlevel")
public class RegistLevelController {

    @Autowired
    private RegistlevelService registlevelService;

    /**
     * 分页查询
     * @param currPage
     * @return
     */
    @RequestMapping("list/{currPage}")
    public PageInfo<RegistLevel> list(@PathVariable Integer currPage, @RequestBody RegistLevel registLevel){
        return registlevelService.list(currPage, registLevel);
    }


}
