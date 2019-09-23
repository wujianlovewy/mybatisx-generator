/**
 * @filename:UserController 2019年4月9日
 * @project wallet-manage  V1.0
 * Copyright(c) 2018 flying-cattle Co. Ltd. 
 * All right reserved. 
 */
package com.flying.cattle.mdg;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.github.flying.cattle.mdg.entity.BasisInfo;
import com.github.flying.cattle.mdg.util.EntityInfoUtil;
import com.github.flying.cattle.mdg.util.Generator;
import com.github.flying.cattle.mdg.util.MySqlToJavaUtil;
/**   
 * Copyright: Copyright (c) 2019 
 * 
 * <p>说明： 自动生成工具</P>
 * <p>源码地址：https://gitee.com/flying-cattle/mybatis-dsc-generator</P>
 */
public class MyGenerator {
		public static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
		// 基础信息：项目名、作者、版本
		public static final String PROJECT = "za-hill"; 
		public static final String AUTHOR = "za-wujian001";
		public static final String VERSION = "V1.0";
		// 数据库连接信息：连接URL、用户名、秘密、数据库名
		public static final String URL = "jdbc:mysql://rm-bp1dp71y66b0r97gj.mysql.rds.aliyuncs.com:3306/tech_fun_00?useUnicode=true&characterEncoding=UTF-8&autoReconnect=true";
		public static final String NAME = "za_dev_tfun";
		public static final String PASS = "za_dev_tfun_33bbeb";
		public static final String DATABASE = "tech_fun_00";
		// 类信息：类名、对象名（一般是【类名】的首字母小些）、类说明、时间
		public static final String CLASSNAME = "ShareInfo";
		public static final String TABLE = "xman_box_share";
		public static final String CLASSCOMMENT = "活动分享信息";
		public static final String AGILE = new Date().getTime() + "";
		// 路径信息，分开路径方便聚合工程项目，微服务项目
		public static final String ENTITY_URL = "com.zhongan.shield.hill.model";
		public static final String DAO_URL = "com.zhongan.shield.hill.mapper";
		public static final String XML_URL = "com.zhongan.shield.hill.mapper";
		public static final String SERVICE_URL = "com.zhongan.shield.hill.service";
		public static final String SERVICE_IMPL_URL = "com.zhongan.shield.hill.service.impl";
		public static final String CONTROLLER_URL = "com.zhongan.shield.hill.controller";
		public static final String FILE_PATH_PREFIX = "D:\\soft\\mybatis-dsc-generator\\src\\main\\java\\";
		//是否是Swagger配置
		public static final String IS_SWAGGER = "true";
		
		
	public static void main(String[] args) {
		String TIME = sdf.format(new Date());
		BasisInfo bi = new BasisInfo(PROJECT, AUTHOR, VERSION, URL, NAME, PASS, DATABASE, TIME, AGILE, ENTITY_URL,
				DAO_URL, XML_URL, SERVICE_URL, SERVICE_IMPL_URL, CONTROLLER_URL,IS_SWAGGER);
		bi.setTable(TABLE);
		bi.setEntityName(MySqlToJavaUtil.getClassName(TABLE));
		bi.setObjectName(MySqlToJavaUtil.changeToJavaFiled(TABLE));
		bi.setEntityComment(CLASSCOMMENT);
		try {
			bi = EntityInfoUtil.getInfo(bi);
			//开始生成文件
			String aa1 = Generator.createEntity(FILE_PATH_PREFIX, bi).toString();
			String aa2 = Generator.createDao(FILE_PATH_PREFIX, bi).toString(); 
			String aa3 = Generator.createDaoImpl(FILE_PATH_PREFIX, bi).toString();
			String aa4 = Generator.createService(FILE_PATH_PREFIX, bi).toString(); 
			String aa5 = Generator.createServiceImpl(FILE_PATH_PREFIX, bi).toString(); 
			String aa6 = Generator.createController(FILE_PATH_PREFIX, bi).toString();
			// 是否创建swagger配置文件
			String aa7 = Generator.createSwaggerConfig(FILE_PATH_PREFIX, bi).toString();
			
			System.out.println(aa1);
			System.out.println(aa2); System.out.println(aa3); System.out.println(aa4);
			System.out.println(aa5); System.out.println(aa6); System.out.println(aa7);
			
			//System.out.println(aa7);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
