package com.atguigu.config;

import com.atguigu.controller.Example02;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan("com.atguigu")
public class MainStars {
    public static void main(String[] args) {

            SpringApplication.run(MainStars.class,args);


    }
}
