package cn.yadao.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Copyright (C), 2018-2028, Chong Qing yadao.cn
 * FileName: SwaggerConfig.java
 *
 * @author jasonkai
 * @version 1.00
 * @introduce：
 * @Date 2019/1/27
 */
@Component
@EnableSwagger2
public class SwaggerConfig {


    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("雅道购物系统")
                .description("雅道购物系统接口文档说明")
                .contact(new Contact("jasonkai", "", "zengkai@itsoruce.cn"))
                .version("1.0")
                .build();
    }


}
