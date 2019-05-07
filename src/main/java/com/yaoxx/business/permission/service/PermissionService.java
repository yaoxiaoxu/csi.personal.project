package com.yaoxx.business.permission.service;

import java.util.List;

import com.yaoxx.base.baseService.BaseService;
import com.yaoxx.business.permission.constant.PermissionType;
import com.yaoxx.entity.Permission;


public interface PermissionService extends BaseService<Permission> {

	List<Permission> findByType(PermissionType type);

}
