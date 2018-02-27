package com.study.SpringBoot.forezp.c02config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MiyaController {

	//读取配置文件的值只需要加@Value("${属性名}")
	@Value("${my.name}")
	private String name;
	
	@Value("${my.age}")
	private int age;
	
	@Value("${my.number}")
	private int number;

	@Value("${my.greeting}")
	private String greeting;
	
	
	@RequestMapping(value = "/miya")
	public String miya() {
		return name + ":" + age + "--" + number + "::" + greeting;
	}
}
