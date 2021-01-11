package org.note.gateway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RefreshScope
@RestController
@RequestMapping("/n")
public class TestNacosConfig {


    @Value("${test.getaway}")
    private String dd;

    @Autowired
    private Environment env;


    @GetMapping
    public Map<String, Object> get() {
        Map<String, Object> map = new HashMap<>();
        map.put("ss",dd);
        String property = env.getProperty("spring.cloud.gateway.discovery.locator.enable", "");
        map.put("property",property);
        return map;
    }

}



