package com.neu.hospital.baseinformation.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.neu.hospital.baseinformation.entity.Rule;
import com.neu.hospital.baseinformation.service.RuleService;
import javax.annotation.Resource;


/**
 * @author wang
 * @email sunlightcs@gmail.com
 * @date 2020-09-07 20:42:15
 */
@RestController
@RequestMapping("/baseinformation/rule")
public class RuleController {

    @Resource
    private RuleService ruleService;

    /**
     * 分页查询
     *
     * @param currPage
     * @return
     */
    @RequestMapping("list/{currPage}")
    public PageInfo<Rule> list(@PathVariable Integer currPage, @RequestBody Rule rule) {
        return ruleService.list(currPage, rule);
    }


}
