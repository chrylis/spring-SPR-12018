package com.chrylis.spr12018.concrete;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.chrylis.spr12018.abstractconfig.AbstractConfig;

@Configuration
public class ConcreteConfig extends AbstractConfig {

    /**
     * This field should be autowired before Spring starts invoking {@code @Bean} methods, but it isn't.
     */
    @Autowired
    private ServiceBeanProvider provider;

    /**
     * I want to autowire a different provider from somewhere else in the context and provide it to the superclass,
     * but the superclass's {@link #serviceBean()} method is called before this class is autowired.
     */
    @Bean
    @Override
    public ServiceBeanProvider provider() {
        return provider;
    }

    @PostConstruct
    public void logMessage() {
        System.err.println("I am called before @Bean methods, but my autowired field is: " + provider);
    }
}
