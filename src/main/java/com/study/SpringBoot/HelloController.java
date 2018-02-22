package com.study.SpringBoot;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController //等同于同时加上了@Controller和@ResponseBody
public class HelloController {

	//访问/hello或者/hi任何一个地址，都会返回一样的结果
    @RequestMapping(value = {"/hello","/hi"},method = RequestMethod.GET)
    public String index() {
        return "Hello World";
    }
/*
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
    	//在程序启动的时候，springboot自动诸如注入了40-50个bean.
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

        };
    }
    */
}