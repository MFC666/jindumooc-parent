package com.jindumooc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.util.zip.DataFormatException;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class JindumoocUserWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(JindumoocUserWebApplication.class, args);
    }

}
