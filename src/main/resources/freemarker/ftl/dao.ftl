package ${daoUrl};

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import ${entityUrl}.${entityName};

/**   
 * <p>说明： ${entityComment}数据访问层</p>
 * @version: ${version}
 * @author: ${author}
 * @Date:   ${createTime}
 */
@Mapper
public interface ${entityName}Mapper extends BaseMapper<${entityName}> {
	
}
	