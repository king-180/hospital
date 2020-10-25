package com.neu.hospital.outpatientdoctor.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

public class PatientCosts {
    private Integer id;

    private Integer registid;

    private Integer invoiceid;

    private Integer itemid;

    private Integer itemtype;

    private String name;

    private BigDecimal price;

    private BigDecimal amount;

    private Integer deptid;

    private Date createtime;

    private Integer createoperid;

    private Date paytime;

    private Integer registerid;

    private Integer feetype;

    private Integer backid;

    @Getter
    @Setter
    @TableField(exist = false)
    private String realName;

    @Getter
    @Setter
    @TableField(exist = false)
    private String deptName;

    @Getter
    @Setter
    @TableField(exist = false)
    private String kaili;

    @Getter
    @Setter
    @TableField(exist = false)
    private String tuifei;

    @Getter
    @Setter
    @TableField(exist = false)
    private String constantName;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRegistid() {
        return registid;
    }

    public void setRegistid(Integer registid) {
        this.registid = registid;
    }

    public Integer getInvoiceid() {
        return invoiceid;
    }

    public void setInvoiceid(Integer invoiceid) {
        this.invoiceid = invoiceid;
    }

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public Integer getItemtype() {
        return itemtype;
    }

    public void setItemtype(Integer itemtype) {
        this.itemtype = itemtype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getCreateoperid() {
        return createoperid;
    }

    public void setCreateoperid(Integer createoperid) {
        this.createoperid = createoperid;
    }

    public Date getPaytime() {
        return paytime;
    }

    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }

    public Integer getRegisterid() {
        return registerid;
    }

    public void setRegisterid(Integer registerid) {
        this.registerid = registerid;
    }

    public Integer getFeetype() {
        return feetype;
    }

    public void setFeetype(Integer feetype) {
        this.feetype = feetype;
    }

    public Integer getBackid() {
        return backid;
    }

    public void setBackid(Integer backid) {
        this.backid = backid;
    }
}