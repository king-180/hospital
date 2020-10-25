package com.neu.hospital.outpatientfinancial.controller;

import com.github.pagehelper.PageInfo;
import com.neu.hospital.outpatientfinancial.entity.Expenseclass;
import com.neu.hospital.outpatientfinancial.service.ExpenseclassService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * 
 *
 * @author wang
 * @email sunlightcs@gmail.com
 * @date 2020-09-07 20:42:16
 */
@RestController
@RequestMapping("/outpatientfinancial/expenseclass")
public class ExpenseclassController {
    @Resource
    private ExpenseclassService expenseclassService;

    /**
        * 分页查询
        *
        * @param currPage
        * @return
        */
    @RequestMapping("list/{currPage}")
    public PageInfo<Expenseclass> list(@PathVariable Integer currPage, @RequestBody Expenseclass expenseclass) {
//        System.out.println(constantItem);
        return expenseclassService.list(currPage, expenseclass);
    }


}
