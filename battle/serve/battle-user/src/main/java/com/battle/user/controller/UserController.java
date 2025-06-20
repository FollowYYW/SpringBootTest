package com.battle.user.controller;

import com.battle.common.returnData.ResultData;
import com.battle.user.entity.Ao.UpdateUserPwdAO;
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

    /**
     * 创建用户
     * @param userInfo
     * @return
     */
    @PostMapping("/createUser")
    public ResultData createUser(@RequestBody UserInfoAo userInfo){
        AppUserVo appUser = userService.addUser(userInfo);
        return ResultData.success(appUser);
    }

    /**
     * 修改用户信息(不包含密码)
     * @param userInfo
     * @return
     */
    @PostMapping("/updateUser")
    public ResultData updateUser(@RequestBody UserInfoAo userInfo){
        return ResultData.success("");
    }

    /**
     * 删除用户
     * @param userCode
     * @return
     */
    @PostMapping("/deleteUser")
    public ResultData deleteUser(@RequestBody String userCode){
        return ResultData.success("");
    }

    /**
     * 注销用户
     * @param userCode
     * @return
     */
    @PostMapping("/logoutUser")
    public ResultData logoutUser(@RequestBody String userCode){
        return ResultData.success("");
    }

    /**
     * 恢复用户
     * @param userCode
     * @return
     */
    @PostMapping("/recoverUser")
    public ResultData recoverUser(@RequestBody String userCode){
        return ResultData.success("");
    }

    /**
     * 重置密码
     * @param userCode
     * @return
     */
    @PostMapping("/resetPwd")
    public ResultData resetUserPwd(@RequestBody String userCode){
        return ResultData.success("");
    }

    /**
     * 修改用户密码
     * @param userPwd
     * @return
     */
    @PostMapping("/updateUserPwd")
    public ResultData updateUserPwd(@RequestBody UpdateUserPwdAO userPwd) {
        return ResultData.success("");
    }
}
