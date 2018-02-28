package com.study.SpringBoot.forezp.c13cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

//@SpringBootApplication
//@EnableCaching //开启缓存技术  这里要用这个要把代码中redis相关注释掉 把AppRunner的注解打开
public class CacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(CacheApplication.class, args);
	}
}
