package com.battle.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.battle.user.entity.dos.AppUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author kinds
 * @Date 2023/2/26 21:14
 * @Description
 */
@Mapper
public interface AppUserMapper extends BaseMapper<AppUser> {
}
