package com.neu.hospital.baseinformation.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class Scheduling {
    private Integer id;

    private Date scheddate;

    private Integer deptid;

    private Integer userid;

    private String noon;

    private Integer ruleid;

    private Integer delmark;

    @Getter
    @Setter
    @TableField(exist = false)
    private String deptname;

    @Getter
    @Setter
    @TableField(exist = false)
    private String realname;

    @Getter
    @Setter
    @TableField(exist = false)
    private String week;

    @Getter
    @Setter
    @TableField(exist = false)
    private String rulename;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getScheddate() {
        return scheddate;
    }

    public void setScheddate(Date scheddate) {
        this.scheddate = scheddate;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getNoon() {
        return noon;
    }

    public void setNoon(String noon) {
        this.noon = noon == null ? null : noon.trim();
    }

    public Integer getRuleid() {
        return ruleid;
    }

    public void setRuleid(Integer ruleid) {
        this.ruleid = ruleid;
    }

    public Integer getDelmark() {
        return delmark;
    }

    public void setDelmark(Integer delmark) {
        this.delmark = delmark;
    }
}