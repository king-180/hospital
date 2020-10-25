package com.neu.hospital.baseinformation.dao;


import com.neu.hospital.baseinformation.entity.DepartMent;
import com.neu.hospital.baseinformation.entity.Rule;

import java.util.List;

public interface RuleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Rule record);

    Rule selectByPrimaryKey(Integer id);

    List<Rule> selectAll();

    int updateByPrimaryKey(Rule record);

    List<Rule> selectAll(Rule rule);
}