package com.kangce.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//D:\jyj\idea\project\finance_project\finance-mybatis\src\main\java\com\kangce\mybatis\mapper
@MapperScan("com.kangce.mybatis.mapper")
@SpringBootApplication
public class FinanceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinanceApplication.class, args);
    }

}
