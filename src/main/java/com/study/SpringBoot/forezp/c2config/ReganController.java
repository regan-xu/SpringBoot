package com.study.SpringBoot.forezp.c2config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.SpringBoot.forezp.interf.TestInterface;
import com.study.pojo.GirlProperties;
import com.study.pojo.MyBean;
import com.study.pojo.User;

@RestController
/*@EnableConfigurationProperties注解是用来开启对@ConfigurationProperties注解配置Bean的支持。
也就是@EnableConfigurationProperties注解告诉Spring Boot 使能支持@ConfigurationProperties*/
@EnableConfigurationProperties({MyBean.class,User.class,GirlProperties.class})
public class ReganController {

	@Autowired
	MyBean myBean;
	
	@RequestMapping("/regan")
	public String regan() {
		return myBean.getGreeting()+" >>>>"+myBean.getName()+" >>>>"+ myBean.getUuid()+" >>>>"+myBean.getMax();
	}
	
	@Autowired
	User user;
	@RequestMapping("/user")
	public String user() {
		return user.getName() + user.getAge();
	}
	
	@Autowired
	GirlProperties girlProperties;
	@RequestMapping("/girlProperties")
	public String girlProperties() {
		return girlProperties.getName() + girlProperties.getAge();
	}
	
	@Autowired
	TestInterface testInterface;
	@RequestMapping("/testInterface")
	public String testInterface() {
		return testInterface.configure();
	}
}
