package com.ral.manages;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.ral.manages.mapper")
@SpringBootApplication
public class ManagesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManagesApplication.class, args);
    }

}
