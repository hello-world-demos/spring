package io.github.munan56.helloworld.spring.service.impl;

import io.github.munan56.helloworld.spring.service.AbstractTestService;
import org.springframework.stereotype.Service;

@Service
public class Test3 extends AbstractTestService {
    @Override
    public String getServiceName() {
        return "this is test3";
    }




}
