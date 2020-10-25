package com.neu.hospital.baseinformation.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

public class FmedItem {
    private Integer id;

    private String itemcode;

    private String itemname;

    private String format;

    private BigDecimal price;

    private Integer expclassid;

    private Integer deptid;

    private String mnemoniccode;

    private Date creationdate;

    private Date lastupdatedate;

    private Integer recordtype;

    private Integer delmark;

    @Getter
    @Setter
    @TableField(exist = false)
    private String expname;

    @Getter
    @Setter
    @TableField(exist = false)
    private String deptname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode == null ? null : itemcode.trim();
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname == null ? null : itemname.trim();
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format == null ? null : format.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getExpclassid() {
        return expclassid;
    }

    public void setExpclassid(Integer expclassid) {
        this.expclassid = expclassid;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public String getMnemoniccode() {
        return mnemoniccode;
    }

    public void setMnemoniccode(String mnemoniccode) {
        this.mnemoniccode = mnemoniccode == null ? null : mnemoniccode.trim();
    }

    public Date getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    public Date getLastupdatedate() {
        return lastupdatedate;
    }

    public void setLastupdatedate(Date lastupdatedate) {
        this.lastupdatedate = lastupdatedate;
    }

    public Integer getRecordtype() {
        return recordtype;
    }

    public void setRecordtype(Integer recordtype) {
        this.recordtype = recordtype;
    }

    public Integer getDelmark() {
        return delmark;
    }

    public void setDelmark(Integer delmark) {
        this.delmark = delmark;
    }
}