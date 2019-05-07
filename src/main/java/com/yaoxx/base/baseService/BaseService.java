
package com.yaoxx.base.baseService;

import java.util.List;

import com.yaoxx.base.baseEntity.Entity;

/**

* Filename:    BaseService.java

* @version:     1.0
* @since:       JDK 1.8.0_91
* @Description:
*
* <br>Modification History:<br>

* Date       |      Author      |      Version    |       Description<br>
* ------------------------------------------------------------------<br>

* 2018年11月20日   |     yao_x_x      |         1.0        |         1.0 Version
 
*/

public interface BaseService<T extends Entity> {
	
	int delete(Long id);

	int add(T record);

	T findById(Long id);

	List<T> findAll();

	int update(T record);

}
