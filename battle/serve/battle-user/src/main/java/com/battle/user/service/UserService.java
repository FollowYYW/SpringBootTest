package com.battle.user.service;

import com.battle.user.entity.Ao.UserInfoAo;
import com.battle.user.entity.vo.AppUserVo;

/**
 * @Author kinds
 * @Date 2023/2/26 16:58
 * @Description
 */
public interface UserService {

    String printRequest(String request);

    AppUserVo addUser(UserInfoAo userInfo);
}
