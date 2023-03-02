package com.feng.battle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author kinds
 * @Date 2023/2/16 1:35
 * @Description
 */
@SpringBootApplication
@EnableDiscoveryClient
public class BattleApplication {

    public static void main(String[] args) {
        SpringApplication.run(BattleApplication.class, args);
    }
}
