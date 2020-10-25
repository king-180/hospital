package com.neu.hospital.outpatientregistration.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author wang
 * @email sunlightcs@gmail.com
 * @date 2020-09-07 20:42:15
 */
@Data
@TableName("registwork")
public class Registwork implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID主键
	 */
	@TableId
	private Integer id;
	/**
	 * 收费人员ID
	 */
	private Integer registerid;
	/**
	 * 日结起始时间
	 */
	private Date starttime;
	/**
	 * 日结结束时间
	 */
	private Date endtime;

	@TableField(exist = false)
	private String realName;

}
