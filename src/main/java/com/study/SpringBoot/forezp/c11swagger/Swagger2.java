package com.study.SpringBoot.forezp.c11swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
//@ComponentScan(basePackages = { "com.*.controller.*" })//配置controller路径
@EnableSwagger2
public class Swagger2 {
	// 启动的地址是http://localhost:8080/springboot/swagger-ui.html 因为在配置里加上了springboot的前缀
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.study.SpringBoot"))
                .paths(PathSelectors.any())
                .build();
	        /*
	         * .paths(Predicates.or(
	                //这里添加你需要展示的接口
	                        PathSelectors.ant("/account/**"),
	                        PathSelectors.ant("/xxx/**"),
	                        PathSelectors.ant("/qqq/**"),
	                        PathSelectors.ant("/eee/**")
	                                    )
	                        )
	         */
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("springboot利用swagger构建api文档")
                .description("简单优雅的restfun风格")
                .termsOfServiceUrl("http://blog.csdn.net/forezp")
                .version("1.0")
                .build();
    }
}
