package com.study.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration //可以认为是特殊的@Component 区别是这个用@Bean注解的方法和字段经过CGLIB处理
@PropertySource(value = "classpath:test.properties")
@ConfigurationProperties(prefix = "com.forezp")
//如果你使用的是1.5以前的版本，那么可以通过locations指定properties文件的位置
//@ConfigurationProperties(prefix = "com.forezp",locations="classpath:test.properties")
public class User {
	//属性必须保持与test.properties中的属性一致
	private String name;
	
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
