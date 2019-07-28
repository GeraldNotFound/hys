package com.dhc.hys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
@MapperScan("hys.src.main.resources.mapper")
public class HysApplication {

    public static void main(String[] args) {
        SpringApplication.run(HysApplication.class, args);
    }

}
