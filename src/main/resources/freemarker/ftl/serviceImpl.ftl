package ${serviceImplUrl};

import ${entityUrl}.${entityName};
import ${daoUrl}.${entityName}Mapper;
import ${serviceUrl}.${entityName}Service;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**    
 * <p>说明： ${entityComment}服务实现层</P>
 * @version: ${version}
 * @author: ${author}
 * @Date:   ${createTime}
 */
@Service
public class ${entityName}ServiceImpl  extends ServiceImpl<${entityName}Mapper, ${entityName}> implements ${entityName}Service  {
	
}