package com.neu.hospital.outpatientpharmacy.entity;

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
@TableName("drugs")
public class Drugs implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID主键
	 */
	@TableId
	private Integer id;
	/**
	 * 药品编码
	 */
	private String drugscode;
	/**
	 * 药品名称
	 */
	private String drugsname;
	/**
	 * 药品规格
	 */
	private String drugsformat;
	/**
	 * 包装单位
	 */
	private String drugsunit;
	/**
	 * 生产厂家
	 */
	private String manufacturer;
	/**
	 * 药品剂型
	 */
	private Integer drugsdosageid;
	/**
	 * 药品类型
	 */
	private Integer drugstypeid;
	/**
	 * 药品单价
	 */
	private BigDecimal drugsprice;
	/**
	 * 拼音助记码
	 */
	private String mnemoniccode;
	/**
	 * 创建时间
	 */
	private Date creationdate;
	/**
	 * 最后修改时间
	 */
	private Date lastupdatedate;
	/**
	 * 删除标记
	 */
	private Integer delmark;

}
