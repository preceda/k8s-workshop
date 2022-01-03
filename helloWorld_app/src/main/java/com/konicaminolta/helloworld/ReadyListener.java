package com.konicaminolta.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ReadyListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(ReadyListener.class);
    private final GreetingService greetingService;

    public ReadyListener(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void doSomethingAfterStartup() {
        LOGGER.info(greetingService.startUpGreeting());
    }
}
