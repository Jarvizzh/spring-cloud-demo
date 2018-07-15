package com.example.svr.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Author: jarvizzhang
 * Date: 2018/7/15
 */
@FeignClient(name = "test-client")
public interface HelloRemote {

    @GetMapping("/feign")
    public String hello(@RequestParam("param") String param);
}
