package com.battle.user.controller;

import com.battle.common.returnData.ResultData;
import com.battle.user.entity.Ao.UserInfoAo;
import com.battle.user.entity.vo.AppUserVo;
import com.battle.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

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

    // 创建用户
    @PostMapping("/createUser")
    public ResultData createUser(@RequestBody UserInfoAo userInfo){
        AppUserVo appUser = userService.addUser(userInfo);
        return ResultData.success(appUser);
    }
    // 修改用户
    @PostMapping("/updateUser")
    public ResultData updateUser(@RequestBody UserInfoAo userInfo){
        return ResultData.success("");
    }

    // 删除用户
    @PostMapping("/deleteUser")
    public ResultData deleteUser(@RequestBody String userCode){
        return ResultData.success("");
    }

    // 注销用户
    @PostMapping("/logoutUser")
    public ResultData logoutUser(@RequestBody String userCode){
        return ResultData.success("");
    }

    // 恢复用户
    @PostMapping("/recoverUser")
    public ResultData recoverUser(@RequestBody String userCode){
        return ResultData.success("");
    }

}
