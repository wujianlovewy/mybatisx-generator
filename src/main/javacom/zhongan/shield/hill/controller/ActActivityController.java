/**
 * @filename:ActActivityController 2019年9月19日
 * @project za-fun  V1.0
 * Copyright(c) 2020 za-wujian001 Co. Ltd. 
 * All right reserved. 
 */
package com.zhongan.shield.hill.controller;

import com.zhongan.shield.hill.aid.AbstractController;
import com.zhongan.shield.hill.model.ActActivity;
import com.zhongan.shield.hill.service.ActActivityService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**   
 * <p>自动生成工具：mybatis-dsc-generator</p>
 * 
 * <p>说明： 活动实体API接口层</P>
 * @version: V1.0
 * @author: za-wujian001
 *
 */
@Api(description = "活动实体",value="活动实体" )
@RestController
@RequestMapping("/actActivity")
public class ActActivityController extends AbstractController<ActActivityService,ActActivity>{

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
}