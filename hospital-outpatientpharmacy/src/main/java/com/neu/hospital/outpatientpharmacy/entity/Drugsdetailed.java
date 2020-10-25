package com.neu.hospital.outpatientpharmacy.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * 
 * @author wang
 * @email sunlightcs@gmail.com
 * @date 2020-09-07 20:42:16
 */
@Data
@TableName("drugsdetailed")
public class Drugsdetailed implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID主键
	 */
	@TableId
	private Integer id;
	/**
	 * 成药模板ID
	 */
	private Integer drugstempid;
	/**
	 * 药品ID
	 */
	private Integer drugsid;
	/**
	 * 用法
	 */
	private String drugsusage;
	/**
	 * 用量
	 */
	private String dosage;
	/**
	 * 频次
	 */
	private String frequency;

}
