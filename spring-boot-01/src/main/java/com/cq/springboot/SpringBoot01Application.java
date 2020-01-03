package com.cq.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//@ImportResource(locations = "classpath:beans.xml")
@SpringBootApplication
public class SpringBoot01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot01Application.class, args);
    }

}
