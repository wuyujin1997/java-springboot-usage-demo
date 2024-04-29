package cn.wuyujin.demo;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.data.keyvalue.repository.support.KeyValueRepositoryFactory;
import org.springframework.data.redis.repository.support.RedisRepositoryFactory;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Slf4j
@MapperScan("cn.wuyujin.demo.mapper")
@EnableSwagger2
@SpringBootApplication(exclude = {
//        KeyValueRepositoryFactory.class,
//        RedisRepositoryFactory.class,
//        RedisAutoConfiguration.class,
})
public class Wuyujin1997Application {
    public static void main(String[] args) {
        log.info("Wuyujin1997Application start run...");
        SpringApplication.run(Wuyujin1997Application.class, args);
        log.info("Wuyujin1997Application run successfully!");
    }
}
