package com.neu.hospital.outpatientregistration.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * @author wang
 * @email sunlightcs@gmail.com
 * @date 2020-09-07 20:42:16
 */
@Data
@TableName("register")
public class Register implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * ID主键
     */
    @TableId
    private Integer id;
    /**
     * 病历号
     */
    private String casenumber;
    /**
     * 姓名
     */
    private String realname;
    /**
     * 性别
     */
    private Integer gender;
    /**
     * 身份证号
     */
    private String idnumber;
    /**
     * 出生日期
     */
    private Date birthdate;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 年龄类型 岁 月 天
     */
    private String agetype;
    /**
     * 家庭住址
     */
    private String homeaddress;
    /**
     * 本次看诊日期
     */
    private Date visitdate;
    /**
     * 午别  上午/下午
     */
    private String noon;
    /**
     * 本次挂号科室ID
     */
    private Integer deptid;
    /**
     * 本次挂号医生ID
     */
    private Integer userid;
    /**
     * 本次挂号级别ID
     */
    private Integer registleid;
    /**
     * 结算类别ID
     */
    private Integer settleid;
    /**
     * 病历本要否  是/否
     */
    private String isbook;
    /**
     * 挂号时间
     */
    private Date registtime;
    /**
     * 挂号员ID
     */
    private Integer registerid;
    /**
     * 本次看诊状态
     */
    private Integer visitstate;

    @TableField(exist = false)
    private String constantname;

    @TableField(exist = false)
    private String deptname;

    @TableField(exist = false)
    private String registName;

    @TableField(exist = false)
    private String settleName;

    @TableField(exist = false)
    private String docName;

}
