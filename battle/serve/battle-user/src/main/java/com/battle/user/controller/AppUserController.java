package com.battle.user.controller;

import com.battle.common.returnData.ResultData;
import com.battle.user.entity.dos.AppUser;
import com.battle.user.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author kinds
 * @Date 2023/2/26 21:27
 * @Description
 */
@RestController
@RequestMapping("/appUser")
public class AppUserController {

    @Autowired
    private AppUserService appUserService;

    @PostMapping("/getAppUser")
    public ResultData getAppUser(@RequestParam Integer id){
        AppUser appUser = appUserService.getAppUser(id);
        return ResultData.success(appUser);
    }
}
