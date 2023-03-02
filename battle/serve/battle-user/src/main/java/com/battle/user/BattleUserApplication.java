package com.battle.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author kinds
 * @Date 2023/2/26 15:56
 * @Description
 */
@SpringBootApplication(scanBasePackages = {"com.battle"})
@EnableDiscoveryClient
public class BattleUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(BattleUserApplication.class, args);
    }
}
