package com.battle.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Author kinds
 * @Date 2023/2/26 15:56
 * @Description
 */
@SpringBootApplication(scanBasePackages = {"com.battle"})
@EnableDiscoveryClient
@EnableFeignClients
public class BattleSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(BattleSystemApplication.class, args);
    }

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
