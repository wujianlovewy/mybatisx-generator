/**
 * @filename:ActActivityDao 2019年9月19日
 * @project za-fun  V1.0
 * Copyright(c) 2020 za-wujian001 Co. Ltd. 
 * All right reserved. 
 */
package com.zhongan.shield.hill.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.zhongan.shield.hill.model.ActActivity;

/**   
 * <p>说明： 活动实体数据访问层</p>
 * @version: V1.0
 * @author: za-wujian001
 * 
 */
@Mapper
public interface ActActivityDao extends BaseMapper<ActActivity> {
	
}
