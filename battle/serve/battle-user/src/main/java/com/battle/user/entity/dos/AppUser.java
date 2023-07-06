package com.battle.user.entity.dos;

import lombok.Data;

import java.util.Date;

/**
 * @Author kinds
 * @Date 2023/2/26 21:04
 * @Description
 */
@Data
public class AppUser {

    /**
     * 主键
     */
    private String id;
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
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 创建人
     */
    private String createUser;
    /**
     * 最后一次修改时间
     */
    private Date updateTime;
    /**
     * 最后一次修改人
     */
    private String updateUser;


}
