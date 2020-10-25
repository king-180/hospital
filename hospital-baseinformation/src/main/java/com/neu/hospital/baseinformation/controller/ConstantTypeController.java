package com.neu.hospital.baseinformation.controller;

import com.github.pagehelper.PageInfo;
import com.neu.hospital.baseinformation.entity.ConstantType;
import com.neu.hospital.baseinformation.service.ConstanttypeService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 常数类别表模块
 */
@RestController
@RequestMapping("/baseinformation/constanttype")
public class ConstantTypeController {

    @Resource
    private ConstanttypeService constanttypeService;

    /**
     * 分页查询
     * @param currPage
     * @return
     */
//    @RequestMapping("list/{currPage}")
//    public PageInfo<ConstantType> list(@PathVariable Integer currPage, @RequestBody ConstantType constantType){
////        System.out.println(constantItem);
//        return constanttypeService.list(currPage, constantType);
//    }


}
