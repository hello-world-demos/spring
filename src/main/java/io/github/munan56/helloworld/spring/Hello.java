package io.github.munan56.helloworld.spring;

import io.github.munan56.helloworld.spring.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class Hello {

    @Autowired
    SpringBeanManager springBeanManager;

    @RequestMapping("/get")
    public List<String> getApps(){
        Map<String, TestService> beansOfType = springBeanManager.getBeansOfType(TestService.class);
        List<String> list = new ArrayList<>();
        beansOfType.forEach((k,v)->{
            String serviceName = v.getServiceName();
            list.add(serviceName);
        });
        return list;
    }
}
