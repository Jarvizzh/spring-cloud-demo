package com.example.client.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Author: jarvizzhang
 * Date: 2018/7/13
 */
@RestController
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hello")
    public String hello() {
        ResponseEntity<String> res = restTemplate.getForEntity("http://test-svr/svr", String.class);
        return JSON.toJSONString(res);
    }

}
