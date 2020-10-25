package com.neu.hospital.outpatientdoctor.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class HerbalDetailed {
    private Integer id;

    private Integer herbalpresid;

    private Integer herbalid;

    private String dosage;

    private BigDecimal price;

    private String footnote;

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

    public Integer getHerbalpresid() {
        return herbalpresid;
    }

    public void setHerbalpresid(Integer herbalpresid) {
        this.herbalpresid = herbalpresid;
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getFootnote() {
        return footnote;
    }

    public void setFootnote(String footnote) {
        this.footnote = footnote == null ? null : footnote.trim();
    }
}