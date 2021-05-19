package io.github.munan56.helloworld.spring.service.impl;

import io.github.munan56.helloworld.spring.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public String getServiceName() {
        return "testService";
    }
}
