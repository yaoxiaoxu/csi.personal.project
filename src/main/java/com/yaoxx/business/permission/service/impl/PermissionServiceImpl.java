package com.yaoxx.business.permission.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yaoxx.base.baseService.impl.BaseServiceImpl;
import com.yaoxx.business.permission.constant.PermissionType;
import com.yaoxx.business.permission.dao.PermissionMapper;
import com.yaoxx.business.permission.service.PermissionService;
import com.yaoxx.entity.Permission;

@Service
public class PermissionServiceImpl extends BaseServiceImpl<PermissionMapper, Permission>
								implements PermissionService{

	@Autowired
	private PermissionMapper permissionDao;
	
	public List<Permission> findByType(PermissionType type) {
		Map<String, Object> params = new HashMap<>();
		params.put("type", type.i);
		List<Permission> resultList = 
				permissionDao.selectMenu(PermissionType.main_menu.i, null);
		return resultList;
	}

}
