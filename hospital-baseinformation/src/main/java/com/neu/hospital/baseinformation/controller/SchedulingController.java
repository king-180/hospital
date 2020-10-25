package com.neu.hospital.baseinformation.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neu.hospital.baseinformation.entity.Scheduling;
import com.neu.hospital.baseinformation.service.SchedulingService;

import javax.annotation.Resource;


/**
 *
 *
 * @author wang
 * @email sunlightcs@gmail.com
 * @date 2020-09-07 20:42:15
 */
@RestController
@RequestMapping("/baseinformation/scheduling")
public class SchedulingController {

    @Resource
    private SchedulingService schedulingService;

    /**
     * 分页查询
     *
     * @param currPage
     * @return
     */
    @RequestMapping("list/{currPage}")
    public PageInfo<Scheduling> list(@PathVariable Integer currPage, @RequestBody Scheduling scheduling) {
//        System.out.println(constantItem);
        return schedulingService.list(currPage, scheduling);
    }

    @RequestMapping("say")
    public String say(){
        return "hello";
    }

}
