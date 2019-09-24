package com.jindumooc;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
@MapperScan(basePackages = "com.jindumooc.dao")
public class JindumoocMaterialServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(JindumoocMaterialServiceApplication.class, args);
    }

}
