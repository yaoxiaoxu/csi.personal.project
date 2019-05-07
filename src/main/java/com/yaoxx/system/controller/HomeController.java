package com.yaoxx.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yaoxx.business.permission.constant.PermissionType;
import com.yaoxx.business.permission.service.PermissionService;
import com.yaoxx.entity.Iuser;
import com.yaoxx.entity.Permission;
import com.yaoxx.system.iuser.service.IuserService;

@Controller
public class HomeController {
	@Autowired
	private PermissionService permissionService;
	@Autowired
	private IuserService iuserService; 
	
	@RequestMapping("/home")
	public String home(Model model) {
		List<Permission> perList = permissionService.findByType(PermissionType.main_menu);
		model.addAttribute("menus", perList);
		return "home/main";
	}
	
	@RequestMapping("/index")
	public String index(Model model) {
		List<Iuser> IuserList = iuserService.findAll();
		model.addAttribute("UserList", IuserList);
		return "home/index";
	}

}
