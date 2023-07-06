package com.battle.user.service.serviceimpl;

import cn.hutool.core.bean.BeanUtil;
import com.battle.common.exception.BusinessException;
import com.battle.user.entity.Ao.UserInfoAo;
import com.battle.user.entity.dos.AppUser;
import com.battle.user.entity.vo.AppUserVo;
import com.battle.user.mapper.AppUserMapper;
import com.battle.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

import static com.battle.common.exception.ExceptionEnums.AddUserFail;

/**
 * @Author kinds
 * @Date 2023/2/26 16:57
 * @Description
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private AppUserMapper appUserMapper;

    @Override
    public String printRequest(String request) {
        System.out.println(request);
        return request;
    }

    @Override
    public AppUserVo addUser(UserInfoAo userInfo) {

        AppUser appUser = new AppUser();
        BeanUtil.copyProperties(userInfo, appUser);

        appUser.setCreateUser("kinds");
        appUser.setCreateTime(new Date());
        appUser.setUpdateUser("kinds");
        appUser.setUpdateTime(new Date());

        int id = appUserMapper.insert(appUser);
        AppUserVo appUserVo = new AppUserVo();
        if (id > 0) {
            AppUser insertAppUser = appUserMapper.selectById(appUser.getId());
            BeanUtil.copyProperties(insertAppUser, appUserVo);
        }else {
            throw new RuntimeException("用户新增失败");
//            throw new BusinessException(AddUserFail.getMessage());
        }

        return appUserVo;
    }
}
