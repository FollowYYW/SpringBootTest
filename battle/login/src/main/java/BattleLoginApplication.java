import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author kinds
 * @Date 2023/4/21 1:12
 * @Description
 */
@SpringBootApplication(scanBasePackages = {"com.battle"})
@EnableDiscoveryClient
public class BattleLoginApplication {

    public static void main(String[] args) {
        SpringApplication.run(BattleLoginApplication.class, args);
    }
}
