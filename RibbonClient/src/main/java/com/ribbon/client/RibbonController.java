package com.ribbon.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/call-hello")
    public String callHello() {
        String url = "http://rest-ribbon-server/hello";
        return restTemplate.getForObject(url, String.class);
    }
}
