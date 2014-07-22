package com.chrylis.spr12018;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.chrylis.spr12018.concrete.ConcreteConfig;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackageClasses = ConcreteConfig.class)
public class Launcher {
    public static void main(String[] args) {
        SpringApplication.run(Launcher.class);
    }
}
