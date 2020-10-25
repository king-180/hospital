package com.neu.hospital.common.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

public class ConstantItem implements Serializable {
    private Integer id;

    private Integer constanttypeid;

    private String constantcode;

    private String constantname;

    @TableLogic
    private Integer delmark;

    @Getter
    @Setter
    @TableField(exist = false)
    private String constanttypename;

    @Getter
    @Setter
    @TableField(exist = false)
    private String constanttypecode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getConstanttypeid() {
        return constanttypeid;
    }

    public void setConstanttypeid(Integer constanttypeid) {
        this.constanttypeid = constanttypeid;
    }

    public String getConstantcode() {
        return constantcode;
    }

    public void setConstantcode(String constantcode) {
        this.constantcode = constantcode == null ? null : constantcode.trim();
    }

    public String getConstantname() {
        return constantname;
    }

    public void setConstantname(String constantname) {
        this.constantname = constantname == null ? null : constantname.trim();
    }

    public Integer getDelmark() {
        return delmark;
    }

    public void setDelmark(Integer delmark) {
        this.delmark = delmark;
    }
}