package com.neu.hospital.baseinformation.controller;

import com.github.pagehelper.PageInfo;
import com.neu.hospital.baseinformation.entity.DepartMent;
import com.neu.hospital.baseinformation.service.DepartmentService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


    /**
     * 科室表模块
     */
    @RestController
    @RequestMapping("/baseinformation/department")
    public class DepartMentController {

        @Resource
        private DepartmentService departmentService;

        @RequestMapping("say")
        public String say() {
            return "hello";
        }

        /**
         * 分页查询
         *
         * @param currPage
         * @return
         */
        @RequestMapping("list/{currPage}")
        public PageInfo<DepartMent> list(@PathVariable Integer currPage, @RequestBody DepartMent departMent) {
//        System.out.println(constantItem);
            return departmentService.list(currPage, departMent);
        }

}
