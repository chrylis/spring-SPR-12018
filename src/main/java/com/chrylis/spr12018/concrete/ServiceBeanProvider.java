package com.chrylis.spr12018.concrete;

import org.springframework.stereotype.Service;

import com.chrylis.spr12018.ServiceBean;

@Service
public class ServiceBeanProvider {
    public ServiceBean getServiceBean() {
        return new ServiceBean("message");
    }
}
