package com.yaoxx.business.permission.dao;

import java.util.List;

import com.yaoxx.base.baseMapper.BaseMapper;
import com.yaoxx.entity.Permission;

public interface PermissionMapper extends BaseMapper<Permission>{
	
	/**
	 * @param type 类型
	 * @param pid	父级
	 * @return 查询菜单	会产生递归调用不推荐使用
	 */
	List<Permission> selectMenu(Integer type,Long pid);
	
	/**
	 * @param pid
	 * @return 通过父级Id查询  会产生递归调用不推荐使用
	 */
	List<Permission> selectByPid(Long pid);
  
}