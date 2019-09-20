package com.jindumooc;


import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableDubbo
@MapperScan(basePackages = "com.jindumooc.dao")
@SpringBootApplication
public class JindumoocClassServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(JindumoocClassServiceApplication.class, args);
    }

}
