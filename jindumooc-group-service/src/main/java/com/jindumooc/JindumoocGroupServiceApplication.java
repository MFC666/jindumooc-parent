package com.jindumooc;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo//开启Dubbo
@SpringBootApplication
@MapperScan(basePackages = "com.jindumooc.dao")
public class JindumoocGroupServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(JindumoocGroupServiceApplication.class, args);
    }

}
