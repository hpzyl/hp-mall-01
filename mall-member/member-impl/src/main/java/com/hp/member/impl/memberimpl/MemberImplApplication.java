package com.hp.member.impl.memberimpl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.hp.member.impl.memberimpl.mapper")
public class MemberImplApplication {

    public static void main(String[] args) {
        SpringApplication.run(MemberImplApplication.class, args);
    }

}
