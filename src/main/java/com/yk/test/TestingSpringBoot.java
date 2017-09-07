package com.yk.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@EnableAutoConfiguration
public class TestingSpringBoot {

    @RequestMapping("/")
    String yooooo(){
        return "yoooooooooo!!!!!";
    }

    @RequestMapping("now")
    String getTime(){
        return "现在时间："+(new Date().toLocaleString());
    }

    public static void main(String[] args){
        SpringApplication.run(TestingSpringBoot.class,args);
    }
}
