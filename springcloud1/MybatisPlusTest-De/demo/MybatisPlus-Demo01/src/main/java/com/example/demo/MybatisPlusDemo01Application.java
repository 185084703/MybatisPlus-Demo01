package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.example.demo.mapper")
@EnableSwagger2
public class MybatisPlusDemo01Application {
    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusDemo01Application.class, args);
    }

}
