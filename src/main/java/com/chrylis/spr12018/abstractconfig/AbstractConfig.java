package com.chrylis.spr12018.abstractconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.chrylis.spr12018.ServiceBean;
import com.chrylis.spr12018.concrete.ServiceBeanProvider;

@Configuration
public abstract class AbstractConfig {

    @Bean
    public ServiceBean serviceBean() {
        return provider().getServiceBean();
    }

    /**
     * The superclass assumes it knows how to create the provider, actually constructed from some other configuration in the
     * environment.
     *
     * @return the provider created by the abstract superclass
     */
    @Bean
    public ServiceBeanProvider provider() {
        return new ServiceBeanProvider();
    }
}
