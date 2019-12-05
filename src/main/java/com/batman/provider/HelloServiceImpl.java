package com.batman.provider;

import com.batman.service.HelloService;

public class HelloServiceImpl implements HelloService {

    public String hello(String msg) {
        return msg != null ? msg + " -----> I am fine." : "I am fine.";
    }

}
