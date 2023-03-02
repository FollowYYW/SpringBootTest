package com.feng.battle.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author kinds
 * @Date 2023/2/26 14:53
 * @Description
 */
@RestController
@RequestMapping("/test")
public class NacosTestController {

    @GetMapping("/nacos/{eho}")
    public String testNacosEcho(String echo){
        return echo;
    }
}
