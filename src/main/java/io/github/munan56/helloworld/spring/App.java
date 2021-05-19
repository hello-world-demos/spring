package io.github.munan56.helloworld.spring;

import io.github.munan56.helloworld.spring.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {

    @Autowired
    private SpringBeanManager springBeanManager;

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(App.class, args);

    }
}
