package com.battle.user.entity.Ao;

import lombok.Data;

/**
 * @Author kinds
 * @Date 2023/5/6 0:53
 * @Description
 */
@Data
public class UserInfoAo {

    /**
     * 用户编码
     */
    private String userCode;
    /**
     * 用户姓名
     */
    private String userName;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 电话
     */
    private String phone;
    /**
     * 性别
     */
    private String gender;
    /**
     * 密码
     */
    private String password;
    /**
     * 年龄
     */
    private String age;

}
