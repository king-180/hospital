package com.neu.hospital.baseinformation.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neu.hospital.baseinformation.dao.ConstantItemMapper;
import com.neu.hospital.baseinformation.entity.ConstantItem;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.neu.hospital.baseinformation.service.ConstantitemService;

import javax.annotation.Resource;


@Service("constantitemService")
public class ConstantitemServiceImpl  implements ConstantitemService {

    @Resource
    private ConstantItemMapper constantItemMapper;

    /**
     * Cacheable如果缓存没有值,则执行方法并缓存数据,如果缓存有值,则从缓存中获取值
     * value：缓存位置名称，不能为空，如果使用EHCache，就是ehcache.xml中声明的cache的name
     * key：缓存的key，默认为空，同上
     * unless参数的作用是：函数返回值符合表达式条件的，veto（否决）、不缓存
     *换句话说，函数返回值符合条件的排除掉、只缓存其余不符合条件的
     * 根据主键加载
     * @param id
     * @return
     */
    @Override
//    @Cacheable(value="constantItem",key="#id",unless="#result==null")
    public ConstantItem selById(Integer id) {
        return constantItemMapper.selectByPrimaryKey(id);
    }
    /**
     * 分页查询
     * @param currPage
     * @return
     */
    @Override
//    @Cacheable(value="list",key="#constantItem",unless="#result==null")
    public PageInfo<ConstantItem> list(Integer currPage, ConstantItem constantItem) {
        if(currPage == null) currPage = 1;
        PageHelper.startPage(currPage,5);
        PageInfo<ConstantItem> pageInfo = new PageInfo<>(constantItemMapper.selectAll(constantItem));
        return pageInfo;
    }

    /**
     * CachePut保证方法被调用，又希望结果被缓存。
     *与@Cacheable区别在于是否每次都调用方法，常用于更新
     * @param
     */
    @Override
//    @CachePut(value="constantItem",key="#constantItem.id")
    public ConstantItem update(ConstantItem constantItem) {
        constantItemMapper.updateByPrimaryKey(constantItem);
        return constantItem;
    }

//    @Override
//    public List<ConstantItem> listAll() {
//        return constantItemMapper.selectAll();
//    }

    @Override
    public PageInfo<ConstantItem> selAll(Integer currPage, ConstantItem constantItem) {
        if(currPage == null) currPage = 1;
        PageHelper.startPage(currPage,5);
        PageInfo<ConstantItem> pageInfo = new PageInfo<>(constantItemMapper.selectAll(constantItem));
        return pageInfo;
    }

    @Override
    public void del(Integer id) {
        constantItemMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void add(ConstantItem constantItem) {
        constantItemMapper.insert(constantItem);
    }
}