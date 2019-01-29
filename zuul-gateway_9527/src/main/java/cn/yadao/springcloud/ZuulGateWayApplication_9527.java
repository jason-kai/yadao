package cn.yadao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy  //启动zuul网关
public class ZuulGateWayApplication_9527 {

    public static void main(String[] args) {
        SpringApplication.run(ZuulGateWayApplication_9527.class, args);
    }

}
