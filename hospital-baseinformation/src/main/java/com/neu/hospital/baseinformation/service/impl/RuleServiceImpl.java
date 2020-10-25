package com.neu.hospital.baseinformation.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neu.hospital.baseinformation.dao.RuleMapper;
import com.neu.hospital.baseinformation.entity.Rule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.neu.hospital.baseinformation.service.RuleService;

import javax.annotation.Resource;


@Service("ruleService")
public class RuleServiceImpl  implements RuleService {

    @Resource
    private RuleMapper ruleMapper;

    /**
     * 分页查询
     * @param currPage
     * @return
     */
    @Override
    public PageInfo<Rule> list(Integer currPage, Rule Rule) {
        if(currPage == null) currPage = 1;
        PageHelper.startPage(currPage,5);
        PageInfo<Rule> pageInfo = new PageInfo<>(ruleMapper.selectAll(Rule));
        return pageInfo;
    }

}