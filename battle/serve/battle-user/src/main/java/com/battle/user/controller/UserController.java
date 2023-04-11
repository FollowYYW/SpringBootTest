package com.battle.user.controller;

import com.battle.common.returnData.ResultData;
import com.battle.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author kinds
 * @Date 2023/2/26 16:42
 * @Description
 */
@RestController
@RefreshScope
@RequestMapping("/user")
public class UserController {

    @Value("${author.name}")
    private String test;

    @Autowired
    private UserService userService;

    @GetMapping("/request/{request}")
    public ResultData printRequest(@PathVariable String request){
        userService.printRequest(request);
        userService.printRequest(test);
//        try {
            if(Integer.parseInt(request) > 10){
                int i = 1/0;
            }
//        }catch (Exception e){
//            throw new RuntimeException("除数不能为0");
//        }
        return ResultData.success(request);
    }
}
