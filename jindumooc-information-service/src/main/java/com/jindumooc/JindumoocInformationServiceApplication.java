package com.jindumooc;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo//开启Dubbo
@SpringBootApplication
@MapperScan("com.jindumooc.dao")
public class JindumoocInformationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(JindumoocInformationServiceApplication.class, args);
    }

}
