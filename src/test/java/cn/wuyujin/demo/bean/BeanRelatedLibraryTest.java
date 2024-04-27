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
                .uid("wuyujin1997")
                .pubRegion("上海")
                .pubDevice("iPhone 14 Pro Max")
                .pubTime(LocalDateTime.now())
                .content("使命召唤 COD")
                .build();
        log.info("weibo json: {}", JSON.toJSON(weibo));

        // 07:24:44.223 [main] INFO cn.wuyujin.demo.bean.BeanRelatedLibraryTest - weibo json:
        // {"content":"使命召唤 COD","id":"52692960","pubDevice":"iPhone 14 Pro Max","pubRegion":"上海","pubTime":"2024-04-25 07:24:43.933283","uid":"wuyujin1997"}
    }

}
