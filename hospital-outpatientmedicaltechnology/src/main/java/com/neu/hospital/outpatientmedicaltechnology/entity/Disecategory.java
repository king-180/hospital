package com.neu.hospital.outpatientmedicaltechnology.entity;

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
@TableName("disecategory")
public class Disecategory implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID主键
	 */
	@TableId
	private Integer id;
	/**
	 * 分类编码
	 */
	private String dicacode;
	/**
	 * 分类名称
	 */
	private String dicaname;
	/**
	 * 显示顺序号
	 */
	private Integer sequenceno;
	/**
	 * 疾病类型
	 */
	private Integer dicatype;
	/**
	 * 删除标记
	 */
	private Integer delmark;

}
