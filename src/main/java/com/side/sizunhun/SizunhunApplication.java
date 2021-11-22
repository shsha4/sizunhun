package com.side.sizunhun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SizunhunApplication {

    public static void main(String[] args) {
        SpringApplication.run(SizunhunApplication.class, args);
    }

}
