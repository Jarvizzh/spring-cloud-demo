package com.example.svr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: jarvizzhang
 * Date: 2018/7/14
 */
@RestController
public class SvrController {

    @GetMapping("/svr")
    public String test(){
        return "this is a server.";
    }

}
