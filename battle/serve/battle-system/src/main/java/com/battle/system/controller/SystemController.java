package com.battle.system.controller;

import com.alibaba.nacos.shaded.org.checkerframework.checker.units.qual.A;
import com.battle.common.returnData.ResultData;
import com.battle.system.entity.dos.AppUser;
import com.battle.system.feign.BattleUserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author kinds
 * @Date 2023/2/26 17:27
 * @Description
 */
@RestController
@RequestMapping("/system")
public class SystemController {

    private final RestTemplate restTemplate;

    @Autowired
    public SystemController(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    @Autowired
    public BattleUserFeign userFeign;

    @GetMapping("/getUserRequest/{request}")
    public ResultData getUserRequest(@PathVariable String request){
        String forObject = restTemplate.getForObject("http://battle-user/user/request/" + request, String.class);
        return ResultData.success(forObject);
    }

    @GetMapping("/systemGetAppUser/{id}")
    public ResultData systemGetAppUser(@PathVariable Integer id){
        AppUser appUser = userFeign.getAppUser(id);
        return ResultData.success(appUser);
    }

}
