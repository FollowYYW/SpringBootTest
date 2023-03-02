package com.battle.user.service.serviceimpl;

import com.battle.user.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author kinds
 * @Date 2023/2/26 16:57
 * @Description
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public String printRequest(String request) {
        System.out.println(request);
        return request;
    }
}
