package cn.yadao.springcloud.factory;

import cn.yadao.springcloud.client.EmployeeClient;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class EmployeeClientHystrixFallbackFactory implements FallbackFactory<EmployeeClient> {
    @Override
    public EmployeeClient create(Throwable throwable) {
        return null;
    }
}
