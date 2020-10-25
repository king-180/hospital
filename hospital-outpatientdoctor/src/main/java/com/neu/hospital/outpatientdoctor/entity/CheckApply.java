package com.neu.hospital.outpatientdoctor.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class CheckApply {
    private Integer id;

    private Integer medicalid;

    private Integer registid;

    private Integer itemid;

    private String name;

    private String objective;

    private String position;

    private Integer isurgent;

    private Integer num;

    private Date creationtime;

    private Integer doctorid;

    private Integer checkoperid;

    private Integer resultoperid;

    private Date checktime;

    private String result;

    private Date resulttime;

    private Integer state;

    private Integer recordtype;

    @Getter
    @Setter
    @TableField(exist = false)
    private String realName;

    @Getter
    @Setter
    @TableField(exist = false)
    private String itemName;

    @Getter
    @Setter
    @TableField(exist = false)
    private String name2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMedicalid() {
        return medicalid;
    }

    public void setMedicalid(Integer medicalid) {
        this.medicalid = medicalid;
    }

    public Integer getRegistid() {
        return registid;
    }

    public void setRegistid(Integer registid) {
        this.registid = registid;
    }

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective == null ? null : objective.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public Integer getIsurgent() {
        return isurgent;
    }

    public void setIsurgent(Integer isurgent) {
        this.isurgent = isurgent;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Date getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }

    public Integer getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(Integer doctorid) {
        this.doctorid = doctorid;
    }

    public Integer getCheckoperid() {
        return checkoperid;
    }

    public void setCheckoperid(Integer checkoperid) {
        this.checkoperid = checkoperid;
    }

    public Integer getResultoperid() {
        return resultoperid;
    }

    public void setResultoperid(Integer resultoperid) {
        this.resultoperid = resultoperid;
    }

    public Date getChecktime() {
        return checktime;
    }

    public void setChecktime(Date checktime) {
        this.checktime = checktime;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public Date getResulttime() {
        return resulttime;
    }

    public void setResulttime(Date resulttime) {
        this.resulttime = resulttime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getRecordtype() {
        return recordtype;
    }

    public void setRecordtype(Integer recordtype) {
        this.recordtype = recordtype;
    }
}