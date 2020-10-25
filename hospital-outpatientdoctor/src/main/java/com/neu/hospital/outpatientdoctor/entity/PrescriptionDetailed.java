package com.neu.hospital.outpatientdoctor.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class PrescriptionDetailed {
    private Integer id;

    private Integer prescriptionid;

    private Integer drugsid;

    private String drugsusage;

    private String dosage;

    private String frequency;

    private BigDecimal amount;

    private Integer state;

    @Getter
    @Setter
    @TableField(exist = false)
    private String prescriptionName;

    @Getter
    @Setter
    @TableField(exist = false)
    private String drugsName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPrescriptionid() {
        return prescriptionid;
    }

    public void setPrescriptionid(Integer prescriptionid) {
        this.prescriptionid = prescriptionid;
    }

    public Integer getDrugsid() {
        return drugsid;
    }

    public void setDrugsid(Integer drugsid) {
        this.drugsid = drugsid;
    }

    public String getDrugsusage() {
        return drugsusage;
    }

    public void setDrugsusage(String drugsusage) {
        this.drugsusage = drugsusage == null ? null : drugsusage.trim();
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage == null ? null : dosage.trim();
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency == null ? null : frequency.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}