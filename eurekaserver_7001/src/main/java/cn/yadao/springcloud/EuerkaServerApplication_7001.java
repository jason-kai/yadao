package cn.yadao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EuerkaServerApplication_7001 {
    public static void main(String[] args) {
        SpringApplication.run(EuerkaServerApplication_7001.class, args);
    }
}
