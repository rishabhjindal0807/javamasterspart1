package com.yubi.BRMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
@ComponentScan(basePackages ="com.yubi.BRMS.*")
public class BrmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(BrmsApplication.class, args);
    }

}
