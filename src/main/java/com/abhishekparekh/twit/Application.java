package com.abhishekparekh.twit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by abhishek on 3/21/17.
 */

@EnableAutoConfiguration
@ComponentScan(basePackages = "com.abhishekparekh.twit")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
