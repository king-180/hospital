package com.neu.hospital.outpatientdoctor.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Getter;
import lombok.Setter;

public class CheckRelation {
    private Integer id;

    private Integer checkprojid;

    private Integer checktempid;

    private String position;

    @Getter
    @Setter
    @TableField(exist = false)
    private String itemName;

    @Getter
    @Setter
    @TableField(exist = false)
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCheckprojid() {
        return checkprojid;
    }

    public void setCheckprojid(Integer checkprojid) {
        this.checkprojid = checkprojid;
    }

    public Integer getChecktempid() {
        return checktempid;
    }

    public void setChecktempid(Integer checktempid) {
        this.checktempid = checktempid;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }
}