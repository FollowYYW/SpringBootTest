package com.battle.user.entity.Ao;

import lombok.Data;

/**
 * @Author kinds
 * @Date 2023/10/28 14:18
 * @Description
 */
@Data
public class UpdateUserPwdAO {

    /**
     * 登录用户(从请求头中获取)
     */
    private String userCode;
    /**
     * 旧密码
     */
    private String oldPwd;
    /**
     * 新密码
     */
    private String newPwd;
    /**
     * 二次确认新密码
     */
    private String confirmNewPwd;
}
