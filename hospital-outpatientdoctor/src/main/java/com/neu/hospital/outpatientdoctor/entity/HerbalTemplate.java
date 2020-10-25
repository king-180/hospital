package com.neu.hospital.outpatientdoctor.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class HerbalTemplate {
    private Integer id;

    private String name;

    private Integer doctorid;

    private Date creationtime;

    private String prescriptiotype;

    private Integer paynumber;

    private String drugsusage;

    private String therapy;

    private String detailed;

    private String advice;

    private String scope;

    private Integer delmark;

    @Getter
    @Setter
    @TableField(exist = false)
    private String realName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(Integer doctorid) {
        this.doctorid = doctorid;
    }

    public Date getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }

    public String getPrescriptiotype() {
        return prescriptiotype;
    }

    public void setPrescriptiotype(String prescriptiotype) {
        this.prescriptiotype = prescriptiotype == null ? null : prescriptiotype.trim();
    }

    public Integer getPaynumber() {
        return paynumber;
    }

    public void setPaynumber(Integer paynumber) {
        this.paynumber = paynumber;
    }

    public String getDrugsusage() {
        return drugsusage;
    }

    public void setDrugsusage(String drugsusage) {
        this.drugsusage = drugsusage == null ? null : drugsusage.trim();
    }

    public String getTherapy() {
        return therapy;
    }

    public void setTherapy(String therapy) {
        this.therapy = therapy == null ? null : therapy.trim();
    }

    public String getDetailed() {
        return detailed;
    }

    public void setDetailed(String detailed) {
        this.detailed = detailed == null ? null : detailed.trim();
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice == null ? null : advice.trim();
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope == null ? null : scope.trim();
    }

    public Integer getDelmark() {
        return delmark;
    }

    public void setDelmark(Integer delmark) {
        this.delmark = delmark;
    }
}