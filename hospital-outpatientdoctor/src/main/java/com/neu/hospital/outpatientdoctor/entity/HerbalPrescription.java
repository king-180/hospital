package com.neu.hospital.outpatientdoctor.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class HerbalPrescription {
    private Integer id;

    private Integer medicalid;

    private Integer registid;

    private Integer userid;

    private String prescriptionname;

    private Date creationtime;

    private String prescriptiotype;

    private Integer paynumber;

    private String frequency;

    private String drugsusage;

    private String therapy;

    private String detailed;

    private String advice;

    private Integer state;

    @Getter
    @Setter
    @TableField(exist = false)
    private String name1;

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

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getPrescriptionname() {
        return prescriptionname;
    }

    public void setPrescriptionname(String prescriptionname) {
        this.prescriptionname = prescriptionname == null ? null : prescriptionname.trim();
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

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency == null ? null : frequency.trim();
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

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}