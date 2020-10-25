package com.neu.hospital.baseinformation.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Getter;
import lombok.Setter;

public class User {
    private Integer id;

    private String username;

    private String password;

    private String realname;

    private Integer usetype;

    private Integer doctitleid;

    private String isscheduling;

    private Integer deptid;

    private Integer registleid;

    private Integer delmark;

    @Getter
    @Setter
    @TableField(exist = false)
    private String constantname;

    @Getter
    @Setter
    @TableField(exist = false)
    private String deptname;

    @Getter
    @Setter
    @TableField(exist = false)
    private String registname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public Integer getUsetype() {
        return usetype;
    }

    public void setUsetype(Integer usetype) {
        this.usetype = usetype;
    }

    public Integer getDoctitleid() {
        return doctitleid;
    }

    public void setDoctitleid(Integer doctitleid) {
        this.doctitleid = doctitleid;
    }

    public String getIsscheduling() {
        return isscheduling;
    }

    public void setIsscheduling(String isscheduling) {
        this.isscheduling = isscheduling == null ? null : isscheduling.trim();
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public Integer getRegistleid() {
        return registleid;
    }

    public void setRegistleid(Integer registleid) {
        this.registleid = registleid;
    }

    public Integer getDelmark() {
        return delmark;
    }

    public void setDelmark(Integer delmark) {
        this.delmark = delmark;
    }
}