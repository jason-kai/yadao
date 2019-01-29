package cn.yadao.springcloud.client;

import cn.yadao.springcloud.domain.Employee;
import cn.yadao.springcloud.factory.EmployeeClientHystrixFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "",
        fallbackFactory = EmployeeClientHystrixFallbackFactory.class)
@RequestMapping("/provider")
public interface EmployeeClient {

    @RequestMapping("")
    Employee getById();

}
