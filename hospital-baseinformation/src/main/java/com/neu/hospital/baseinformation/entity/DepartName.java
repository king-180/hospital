package com.neu.hospital.baseinformation.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepartName {

    private Integer id;

    private String deptName;

    private String deptcode;

}
