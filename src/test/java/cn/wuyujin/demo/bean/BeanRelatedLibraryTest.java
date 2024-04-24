package cn.wuyujin.demo.bean;

import cn.wuyujin.demo.bean.entity.Weibo;
import com.alibaba.fastjson2.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@Slf4j
@SpringBootApplication
public class BeanRelatedLibraryTest {

    @Test
    void testLombokAndFastJson() {
        Weibo weibo = Weibo.builder()
                .id("52692960")
                .pubRegion("上海")
                .pubDevice("iPhone 14 Pro Max")
                .pubTime(LocalDateTime.now())
                .text("使命召唤 COD")
                .build();
        log.info("weibo json: {}", JSON.toJSON(weibo));

        // {"id":"52692960","pubDevice":"iPhone 14 Pro Max","pubRegion":"上海","pubTime":"2024-04-25 06:58:23.896129","text":"使命召唤 COD"}
    }

}
