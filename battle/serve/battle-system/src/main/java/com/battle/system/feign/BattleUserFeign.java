package com.battle.system.feign;

import com.battle.system.entity.dos.AppUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @Author kinds
 * @Date 2023/3/2 1:10
 * @Description
 */
@FeignClient(name = "battle-user")  // 服务名
public interface BattleUserFeign {

    @PostMapping("/appUser/getAppUser")
    AppUser getAppUser(@RequestParam(name = "id") Integer id);

}
