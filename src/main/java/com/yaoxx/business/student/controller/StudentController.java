
package com.yaoxx.business.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yaoxx.business.student.service.StudentService;
import com.yaoxx.entity.Iuser;

/**

* @author:	yao_x_x
* @since:	JDK 1.8.0_91
* @Description:
*
*/
@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/list")
	public String list(){
		return "";
	}

	/**
	 * @return
	 */
	@RequestMapping("/getList")
	@ResponseBody
	public List<Iuser> getList(){
		return studentService.findAll();
	}
	
	@RequestMapping("/index")
	public String index() {
		return "/home/main";
	}
	
}
