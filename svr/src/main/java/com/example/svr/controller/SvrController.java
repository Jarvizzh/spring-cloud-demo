package com.example.svr.controller;

import com.example.svr.rpc.HelloRomote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: jarvizzhang
 * Date: 2018/7/14
 */
@RestController
public class SvrController {

    @Autowired
    HelloRomote helloRomote;

    @GetMapping("/rpc/{name}")
    public String testRPC(@PathVariable String name){
        return helloRomote.hello(name);
    }

    @GetMapping("/svr")
    public String test(){
        return "this is a server.";
    }

}
