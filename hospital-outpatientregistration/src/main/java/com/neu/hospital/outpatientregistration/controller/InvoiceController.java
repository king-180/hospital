package com.neu.hospital.outpatientregistration.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neu.hospital.outpatientregistration.entity.Invoice;
import com.neu.hospital.outpatientregistration.service.InvoiceService;

import javax.annotation.Resource;


/**
 * 
 *
 * @author wang
 * @email sunlightcs@gmail.com
 * @date 2020-09-07 20:42:16
 */
@RestController
@RequestMapping("/outpatientregistration/invoice")
public class InvoiceController {
    @Resource
    private InvoiceService invoiceService;

    /**
        * 分页查询
        *
        * @param currPage
        * @return
        */
    @RequestMapping("list/{currPage}")
    public PageInfo<Invoice> list(@PathVariable Integer currPage, @RequestBody Invoice invoice) {
//        System.out.println(constantItem);
        return invoiceService.list(currPage, invoice);
    }


}
