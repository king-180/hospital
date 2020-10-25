package com.neu.hospital.outpatientdoctor.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Getter;
import lombok.Setter;

public class HerbalTempDetailed {
    private Integer id;

    private Integer herbaltempid;

    private Integer herbalid;

    private String dosage;

    private String unit;

    private String footnote;

    @Getter
    @Setter
    @TableField(exist = false)
    private String name;

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

    public Integer getHerbaltempid() {
        return herbaltempid;
    }

    public void setHerbaltempid(Integer herbaltempid) {
        this.herbaltempid = herbaltempid;
    }

    public Integer getHerbalid() {
        return herbalid;
    }

    public void setHerbalid(Integer herbalid) {
        this.herbalid = herbalid;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage == null ? null : dosage.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getFootnote() {
        return footnote;
    }

    public void setFootnote(String footnote) {
        this.footnote = footnote == null ? null : footnote.trim();
    }
}