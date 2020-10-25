package com.neu.hospital.outpatientregistration.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
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
@TableName("invoice")
public class Invoice implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID主键
	 */
	@TableId
	private Integer id;
	/**
	 * 发票号码
	 */
	private String invoicenum;
	/**
	 * 发票金额
	 */
	private BigDecimal money;
	/**
	 * 发票状态  1-正常  2-作废 
	 */
	private Integer state;
	/**
	 * 收/退费时间 
	 */
	private Date creationtime;
	/**
	 * 收/退费人员ID 
	 */
	private Integer userid;
	/**
	 * 挂号ID 
	 */
	private Integer registid;
	/**
	 * 收费方式 
	 */
	private Integer feetype;
	/**
	 * 冲红发票号码
	 */
	private String back;
	/**
	 * 发票状态  0-未日结  1-已提交  2-已审核 
	 */
	private Integer dailystate;

}
