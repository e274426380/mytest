package com.yaorange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.yaorange.mapper"})
public class FarmerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FarmerDemoApplication.class, args);
    }

}
