package com.only.nbi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan({"com.only.nbi.**.mapper"})
@SpringBootApplication
public class NbiApplication {

    public static void main(String[] args) {
        SpringApplication.run(NbiApplication.class, args);
    }

}
