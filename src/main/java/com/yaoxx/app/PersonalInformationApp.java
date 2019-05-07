
package com.yaoxx.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.web.client.RestTemplate;

/**

* @author:	yao_x_x
* @since:	JDK 1.8.0_91
* @Description:
* 		服务：个人信息管理
*
*/
@SpringBootApplication
@EnableEurekaClient
//@ComponentScans({"controller"})
//@ComponentScan(basePackages = {"com.yaoxx.business.student.service.impl","com.yaoxx.business.student.controller"})
@MapperScan({"com.yaoxx.**.dao"})
@ComponentScan("com.yaoxx")
@ServletComponentScan("com.yaoxx")
public class PersonalInformationApp {
	
	public static void main(String[] args) {
		SpringApplication.run(PersonalInformationApp.class);
	}
	
	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
