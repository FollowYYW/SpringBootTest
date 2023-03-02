package com.feng.abttle.api;

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
    String testRequest(@RequestBody String test);
}
