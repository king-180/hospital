package com.neu.hospital.outpatientregistration.service.impl;

import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;


import com.neu.hospital.outpatientregistration.dao.InvoiceMapper;
import com.neu.hospital.outpatientregistration.entity.Invoice;
import com.neu.hospital.outpatientregistration.service.InvoiceService;

import javax.annotation.Resource;


@Service("invoiceService")
public class InvoiceServiceImpl  implements InvoiceService {

    @Resource
    private InvoiceMapper invoiceMapper;

    /**
      * 分页查询
      * @param currPage
      * @return
      */
    @Override
    public PageInfo<Invoice> list(Integer currPage, Invoice invoice) {
        if(currPage == null) currPage = 1;
        PageHelper.startPage(currPage,5);
        PageInfo<Invoice> pageInfo = new PageInfo<>(invoiceMapper.selectAll(invoice));
        return pageInfo;
    }

}