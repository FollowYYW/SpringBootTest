package com.feng.abttle.api;

import com.battle.common.returnData.ResultData;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author kinds
 * @Date 2023/2/16 22:33
 * @Description
 */
@RequestMapping("/testHello")
public interface TestRequest {

    @PostMapping("/hello")
    ResultData testRequest(@RequestBody String test);
}
