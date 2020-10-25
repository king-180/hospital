package com.neu.hospital.baseinformation.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neu.hospital.baseinformation.entity.FmedItem;
import com.neu.hospital.baseinformation.service.FmeditemService;

/**
 *
 *
 * @author wang
 * @email sunlightcs@gmail.com
 * @date 2020-09-07 20:42:16
 */
@RestController
@RequestMapping("/baseinformation/fmeditem")
public class FmedItemController {

    @Autowired
    private FmeditemService fmeditemService;

    /**
     * 分页查询
     *
     * @param currPage
     * @return
     */
    @RequestMapping("list/{currPage}")
    public PageInfo<FmedItem> list(@PathVariable Integer currPage, @RequestBody FmedItem fmeditem) {
//        System.out.println(constantItem);
        return fmeditemService.list(currPage, fmeditem);
    }
}