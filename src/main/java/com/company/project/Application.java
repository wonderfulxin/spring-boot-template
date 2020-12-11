package com.company.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.company.project.dao")
public class Application {


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("start success");
    }
}

