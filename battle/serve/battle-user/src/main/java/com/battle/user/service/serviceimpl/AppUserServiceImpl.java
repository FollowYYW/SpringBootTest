package com.battle.user.service.serviceimpl;

import com.battle.common.util.RedisUtil;
import com.battle.user.entity.dos.AppUser;
import com.battle.user.mapper.AppUserMapper;
import com.battle.user.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author kinds
 * @Date 2023/2/26 21:31
 * @Description
 */
@Service
public class AppUserServiceImpl implements AppUserService {

    @Autowired
    private AppUserMapper appUserMapper;
    @Autowired
    private RedisUtil redisUtil;

    @Override
    public AppUser getAppUser(Integer id) {

        AppUser appUser = appUserMapper.selectById(id);
        redisUtil.set(appUser.getName(),appUser.getPhone());
        return appUser;
    }
}
