
package com.yaoxx.business.student.service.impl;

import org.springframework.stereotype.Service;

import com.yaoxx.base.baseService.impl.BaseServiceImpl;
import com.yaoxx.business.student.service.StudentService;
import com.yaoxx.entity.Iuser;
import com.yaoxx.system.iuser.dao.IuserMapper;

/**

* @author:	yao_x_x
* @since:	JDK 1.8.0_91
* @Description:
*
*/
@Service
public class StudentServiceImpl extends BaseServiceImpl<IuserMapper, Iuser> implements StudentService{
	
	/*=*****************cloud*********************=*/
//	@Autowired
//	private RestTemplate restTemplate;
//	
//	private final String clien1_url_student = "http://eureka-cli1/student/";
//	
//	
//	public List<String> getList(){
//		String url = clien1_url_student+"getList";
//		@SuppressWarnings("unchecked")
//		List<String> resultList= restTemplate.getForObject(url, List.class);
//		return resultList;
//	}
	/*=*****************cloud*********************=*/

}
