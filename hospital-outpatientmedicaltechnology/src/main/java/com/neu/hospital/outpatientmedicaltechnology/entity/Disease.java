package com.neu.hospital.outpatientmedicaltechnology.entity;

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
 * @date 2020-09-07 20:42:16
 */
@Data
@TableName("disease")
public class Disease implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID主键
	 */
	@TableId
	private Integer id;
	/**
	 * 疾病助记编码
	 */
	private String diseasecode;
	/**
	 * 疾病名称
	 */
	private String diseasename;
	/**
	 * 国际ICD编码
	 */
	private String diseaseicd;
	/**
	 * 疾病所属分类
	 */
	private Integer disecategoryid;
	/**
	 * 删除标记
	 */
	private Integer delmark;

	/**
	 * 分类名称
	 */
	@TableField(exist = false)
	private String dicaname;

	/**
	 * 疾病类型
	 */
	@TableField(exist = false)
	private Integer dicatype;

}
