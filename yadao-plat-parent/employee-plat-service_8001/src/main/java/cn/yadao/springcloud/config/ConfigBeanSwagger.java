package cn.yadao.springcloud.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Copyright (C), 2018-2028, Chong Qing yadao.cn
 * FileName: ConfigBean.java
 *
 * @author jasonkai
 * @version 1.00
 * @introduce：
 * @Date 2019/1/27
 */
@SpringBootConfiguration
@EnableSwagger2
public class ConfigBeanSwagger {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.yadao.springcloud.web.controller"))
                .paths(PathSelectors.any())
                .build();
    }


    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("雅道平台服务api")
                .description("雅道平台服务接口文档说明")
                .contact(new Contact("jasonkai", "", " zengkai@itsource.cn"))
                .version("1.0")
                .build();
    }

}
