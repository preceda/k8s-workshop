package com.konicaminolta.helloworld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    private static final String STARTUP_PREFIX = "Application has just started up! ";
    private static final String GREETING = "Hello world. My pod name is ";

    @Value("${POD_NAME:empty}")
    private String podName;

    public String sayHello() {
        return GREETING + podName;
    }

    public String startUpGreeting() {
        return STARTUP_PREFIX + sayHello();
    }
}
