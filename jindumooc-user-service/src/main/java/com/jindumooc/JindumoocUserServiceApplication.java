package com.jindumooc;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EnableDubbo//开启Dubbo
@SpringBootApplication
@MapperScan(basePackages = "com.jindumooc.dao")
public class JindumoocUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(JindumoocUserServiceApplication.class, args);
    }

}
