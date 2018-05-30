package com.bowlingcenter.alleymanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
//@EnableAspectJAutoProxy(proxyTargetClass=true)
@ComponentScan
public class AlleymanagerApplication extends WebMvcAutoConfiguration {

    public static void main(String[] args) {
        SpringApplication.run(AlleymanagerApplication.class, args);
    }
}
