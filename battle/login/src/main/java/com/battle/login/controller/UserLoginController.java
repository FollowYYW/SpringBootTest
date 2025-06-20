package com.battle.login.controller;

import com.battle.login.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author kinds
 * @Date 2023/4/21 1:16
 * @Description
 */
@RestController
@RequestMapping("/user/login")
public class UserLoginController {

    @Autowired
    private UserLoginService userLoginService;

}
