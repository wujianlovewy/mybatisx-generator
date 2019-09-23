/**
 * @filename:ActActivity 2019年9月19日
 * @project za-fun  V1.0
 * Copyright(c) 2020 za-wujian001 Co. Ltd. 
 * All right reserved. 
 */
package com.zhongan.shield.hill.model;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
import java.util.Date;

/**   
 * <p>说明： 活动实体实体类</P>
 * @version: V1.0
 * @author: za-wujian001
 * 
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ActActivity extends Model<ActActivity> {

	private static final long serialVersionUID = 1568890261460L;
	
	@TableId(value = "id", type = IdType.AUTO)
	@ApiModelProperty(name = "id" , value = "id")
	private Long id;
    
	@ApiModelProperty(name = "code" , value = "活动code")
	private String code;
    
	@ApiModelProperty(name = "name" , value = "活动名称")
	private String name;
    
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	@ApiModelProperty(name = "startTime" , value = "参与的开始时间")
	private Date startTime;
    
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	@ApiModelProperty(name = "endTime" , value = "参与的结束时间")
	private Date endTime;
    
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	@ApiModelProperty(name = "showStartTime" , value = "展示的时间时间")
	private Date showStartTime;
    
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	@ApiModelProperty(name = "showEndTime" , value = "展示的结束时间")
	private Date showEndTime;
    
	@ApiModelProperty(name = "departmentCode" , value = "所属部门code")
	private String departmentCode;
    
	@ApiModelProperty(name = "departmentName" , value = "所属部门name")
	private String departmentName;
    
	@ApiModelProperty(name = "manager" , value = "负责人，用逗号分隔")
	private String manager;
    
	@ApiModelProperty(name = "channel" , value = "展示渠道")
	private String channel;
    
	@ApiModelProperty(name = "budgets" , value = "关联预算")
	private String budgets;
    
	@ApiModelProperty(name = "url" , value = "活动链接")
	private String url;
    
	@ApiModelProperty(name = "template" , value = "模板code")
	private String template;
    
	@ApiModelProperty(name = "templateConfig" , value = "模板配置")
	private String templateConfig;
    
	@ApiModelProperty(name = "shareTitle" , value = "分享标题")
	private String shareTitle;
    
	@ApiModelProperty(name = "shareDesc" , value = "分享描述")
	private String shareDesc;
    
	@ApiModelProperty(name = "shareImg" , value = "分享图片")
	private String shareImg;
    
	@ApiModelProperty(name = "shareUrl" , value = "分享跳转链接")
	private String shareUrl;
    
	@ApiModelProperty(name = "ilogPageId" , value = "埋点的页面id")
	private Long ilogPageId;
    
	@ApiModelProperty(name = "domains" , value = "域名")
	private String domains;
    
	@ApiModelProperty(name = "isDeleted" , value = "是否删除")
	private String isDeleted;
    
	@ApiModelProperty(name = "creator" , value = "创建人")
	private String creator;
    
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	@ApiModelProperty(name = "gmtCreated" , value = "创建时间")
	private Date gmtCreated;
    
	@ApiModelProperty(name = "modifier" , value = "最后修改人")
	private String modifier;
    
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	@ApiModelProperty(name = "gmtModified" , value = "修改时间")
	private Date gmtModified;
    

	@Override
    protected Serializable pkVal() {
        return this.id;
    }
}
