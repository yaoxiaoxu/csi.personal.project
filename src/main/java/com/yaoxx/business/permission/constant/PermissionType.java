
package com.yaoxx.business.permission.constant;

import java.util.HashMap;
import java.util.Map;

/**

* @author:	yao_x_x
* @since:	JDK 1.8.0_91
* @Description:
*/

public enum PermissionType {
	
	/**
	 * 主导航（最上面的）
	 */
	navigation(1),
	/**
	 * 主菜单
	 */
	main_menu(2),
	/**
	 * 次级菜单
	 */
	sub_menu(3),
	/**
	 * 页面内容
	 */
	page_content(4);
	
	public int i;
	private PermissionType(int i){
		this.i=i;
	}
	
	/**
	 * @param i
	 * @return 
	 * @Description: 通过状态(i)获取一个枚举对象
	 */
	public static PermissionType get(Integer i){
		PermissionType[] values = PermissionType.values();
		for (PermissionType OnOffType : values) {
			if (i.equals(OnOffType.i)) {
				return OnOffType;
			}
		}
		return null;
	}
	
	/**
	 * @return 
	 * @Description: 获取  map：Name(String)-状态码
	 */
	public static Map<String, Integer> getTypeMap(){
		PermissionType[] values = PermissionType.values();
		Map<String, Integer> result = new HashMap<>();
		for (PermissionType OnOffType : values) {
			result.put(String.valueOf(OnOffType.name()), OnOffType.i);
		}
		return result;
	}
}
