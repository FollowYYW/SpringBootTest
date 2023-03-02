package com.battle.system.entity.dos;

import lombok.Data;

/**
 * @Author kinds
 * @Date 2023/2/26 21:04
 * @Description
 */
@Data
public class AppUser {

    private Integer id;
    private String name;
    private String email;
    private String phone;
    private String gender;
    private String password;
    private String age;

}
