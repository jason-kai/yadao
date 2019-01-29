package cn.yadao.springcloud.config;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (C), 2018-2028, Chong Qing yadao.cn
 * FileName: DocumentationConfig.java
 *
 * @author jasonkai
 * @version 1.00
 * @introduce：
 * @Date 2019/1/27
 */
@Component
@Primary
public class DocumentationConfig implements SwaggerResourcesProvider {
    @Override
    public List<SwaggerResource> get() {
        List resources = new ArrayList<>();
        //product,user等都是网关中配置路径,而且如果有前缀,需要加上
        resources.add(swaggerResource("雅道后台登录系统", "/services/user/v2/api-docs", "2.0"));
        resources.add(swaggerResource("商品系统", "/product/v2/api-docs", "2.0"));
        resources.add(swaggerResource("用户系统", "/user/v2/api-docs", "2.0"));
        resources.add(swaggerResource("基础系统", "/common/v2/api-docs", "2.0"));
        return resources;
    }

    private SwaggerResource swaggerResource(String name, String location, String version) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(location);
        swaggerResource.setSwaggerVersion(version);
        return swaggerResource;
    }
}
