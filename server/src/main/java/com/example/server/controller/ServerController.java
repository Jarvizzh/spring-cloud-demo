package com.example.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: jarvizzhang
 * Date: 2018/7/13
 */
@RestController
public class ServerController {

    @GetMapping("/svr")
    public String helloSvr() {
        return "hello svr";
    }


}
