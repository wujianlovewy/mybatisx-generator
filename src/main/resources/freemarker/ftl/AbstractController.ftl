/**
 * @filename:${entityName}Controller ${createTime}
 * @project ${project}  ${version}
 * Copyright(c) 2020 ${author} Co. Ltd. 
 * All right reserved. 
 */
package ${abstractControllerUrl};

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.flying.cattle.mdg.aid.ResultBase;
import com.github.flying.cattle.mdg.aid.PageParam;
<#if isSwagger=="true" >
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
</#if>

/**
 * <p>说明： ${entityComment}API接口层</P>
 * @version: ${version}
 * @author: ${author}
 *
 */
public class AbstractController<S extends IService<T>,T>{
	
	@Autowired
    protected S baseService;

	/**
	 * @explain 查询对象  <swagger GET请求>
	 * @param   对象参数：id
	 * @return  JsonResult
	 * @author  ${author}
	 * @time    2019年4月9日
	 */
	@GetMapping("/getById/{id}")
	<#if isSwagger=="true" >
	@ApiOperation(value = "获取对象", notes = "作者：${author}")
	@ApiImplicitParam(paramType="path", name = "id", value = "对象id", required = true, dataType = "Long")
	</#if>
	public ResultBase<T> getById(@PathVariable("id")Long id){
		T obj=baseService.getById(id);
		if (null!=obj ) {
			return ResultBase.success(obj);
		}
		return ResultBase.error("查询对象不存在！");
	}
	
	/**
	 * @explain 删除对象
	 * @param   对象参数：id
	 * @return  JsonResult
	 * @author  ${author}
	 * @time    2019年4月9日
	 */
	@PostMapping("/deleteById")
	<#if isSwagger=="true" >
	@ApiOperation(value = "删除", notes = "作者：${author}")
	@ApiImplicitParam(paramType="query", name = "id", value = "对象id", required = true, dataType = "Long")
	</#if>
	public ResultBase<T> deleteById(Long id){
		T obj=baseService.getById(id);
		if (null!=obj) {
		  boolean rsg = baseService.removeById(id);
		  if (rsg) {
			  return ResultBase.success("删除成功");
		  }
		  return ResultBase.error("删除失败！");
		}
		return ResultBase.error("删除的对象不存在！");
	}
	
	/**
	 * @explain 添加
	 * @param   对象参数：T
	 * @return  Boolean
	 * @author  ${author}
	 * @time    2019年4月9日
	 */
	@PostMapping("/insert")
	<#if isSwagger=="true" >
	@ApiOperation(value = "添加", notes = "作者：${author}")
	</#if>
	public ResultBase<T> insert(@RequestBody T entity){
		if (null!=entity) {
			boolean rsg = baseService.save(entity);
			if (rsg) {
			  return ResultBase.success("添加成功");
			}
			return ResultBase.error("添加失败！");
		}
		return ResultBase.error("请传入正确参数！");
	}
	
	/**
	 * @explain 修改
	 * @param   对象参数：T
	 * @return  Boolean
	 * @author  ${author}
	 * @time    2019年4月9日
	 */
	@PostMapping("/update")
	<#if isSwagger=="true" >
	@ApiOperation(value = "修改", notes = "作者：${author}")
	</#if>
	public ResultBase<T> update(@RequestBody T entity){
		if (null!=entity) {
			boolean rsg = baseService.updateById(entity);
			if (rsg) {
			  return ResultBase.success("修改成功");
			}
			return ResultBase.error("修改失败");
		}
		return ResultBase.error("请传入正确参数");
	}
	
	/**
	 * @explain 分页条件查询接口
	 * @param   对象参数：PageParam<T>
	 * @return  IPage<T>
	 * @author  ${author}
	 * @time    2019年5月20日
	 */
	@PostMapping("/pageQuery")
	<#if isSwagger=="true" >
	@ApiOperation(value = "分页查询")
	</#if>
	public ResultBase<IPage<T>> getPages(@RequestBody PageParam<T> param){
		Page<T> page=new Page<T>(param.getPageNum(),param.getPageSize());
		QueryWrapper<T> queryWrapper =new QueryWrapper<T>();
		if(null!=param.getParam())) {
			queryWrapper.setEntity(param.getParam());
		}
		//分页数据
		IPage<T> pageData=baseService.page(page, queryWrapper);
		
		return ResultBase.success(pageData);
	}
}
