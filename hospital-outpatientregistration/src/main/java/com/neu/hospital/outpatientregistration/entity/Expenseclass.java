package com.neu.hospital.outpatientregistration.entity;

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
 * @date 2020-09-07 20:42:16
 */
@Data
@TableName("expenseclass")
public class Expenseclass implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID主键
	 */
	@TableId
	private Integer id;
	/**
	 * 费用科目编码
	 */
	private String expcode;
	/**
	 * 费用科目名称
	 */
	private String expname;
	/**
	 * 删除标记
	 */
	private Integer delmark;

}
