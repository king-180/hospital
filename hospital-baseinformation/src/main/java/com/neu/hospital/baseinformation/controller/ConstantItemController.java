package com.neu.hospital.baseinformation.controller;

import com.github.pagehelper.PageInfo;
import com.neu.hospital.baseinformation.entity.ConstantItem;
import com.neu.hospital.baseinformation.service.ConstantitemService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 常数项表模块
 */
@RestController
@RequestMapping("/baseinformation/constantitem")
public class ConstantItemController {

    @Resource
    private ConstantitemService constantitemService;

    @RequestMapping("say")
    public String say() {
        return "hello";
    }

    /**
     * 分页查询
     * @param currPage
     * @return
     */
    @RequestMapping("list/{currPage}")
    public PageInfo<ConstantItem> list(@PathVariable Integer currPage, @RequestBody ConstantItem constantItem){
//        System.out.println(constantItem);
        return constantitemService.list(currPage, constantItem);
    }

//    @RequestMapping("selAll/{currPage}")
//    public PageInfo<ConstantItem> selAll(@PathVariable Integer currPage, @RequestBody ConstantItem constantItem){
////        System.out.println(constantItem);
//        return constantitemService.list(currPage, constantItem);
//    }
    /**
     * 列表查询
     * @param
     * @return
     */
//    @RequestMapping("listAll")
//    public List<ConstantItem> list(){
//        return constantitemService.listAll();
//    }

    /**
     * 修改
     * @param constantItem
     * @return
     */
    @RequestMapping("update")
    public String update(@RequestBody ConstantItem constantItem){
        constantitemService.update(constantItem);
        return "succ";
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping("del/{id}")
    public String del(@PathVariable Integer id){
        constantitemService.del(id);
        return "succ";
    }

    /**
     * 新增
     * @param
     * @return
     */
    @RequestMapping("add")
    public String add(@RequestBody ConstantItem constantItem){
        constantitemService.add(constantItem);
        return "succ";
    }

    /**
     * 根据ID加载记录
     * @param id
     * @return
     */
    @RequestMapping("selById/{id}")
    public ConstantItem selById(@PathVariable Integer id){
        return constantitemService.selById(id);
    }

}
