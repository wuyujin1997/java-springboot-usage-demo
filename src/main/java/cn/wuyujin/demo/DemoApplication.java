package cn.wuyujin.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Slf4j
@EnableSwagger2
@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        log.info("DemoApplication start run...");
        SpringApplication.run(DemoApplication.class, args);
        log.info("DemoApplication run successfully!");
    }
}
