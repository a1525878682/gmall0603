package com.lyx.lyxmall.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;


@SpringBootApplication
@MapperScan(basePackages = "com.lyx.lyxmall.user.mapper")
public class LyxmallUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LyxmallUserServiceApplication.class, args);
    }

}
