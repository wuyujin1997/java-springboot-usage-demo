package cn.wuyujin.demo.service.impl;

import cn.wuyujin.demo.service.MyRedisService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Slf4j
@Service
public class MyRedisServiceImpl implements MyRedisService {

    @Autowired
    private RedisTemplate redisTemplate;

    // redis key 的前缀，按照业务需求自定义，用冒号隔开。
    private static final String KEY_PREFIX = "aaa:bbb:ccc:";

    @Override
    public void set(String key, Object value) {
        String wholeKey = KEY_PREFIX + key;
        ValueOperations valueOperations = redisTemplate.opsForValue();
        String storageValue = value + " " + LocalDateTime.now().toString();
        log.info("redis set {} ==> {}", wholeKey, value);
        valueOperations.set(wholeKey, storageValue);
    }

    @Override
    public Object get(String key) {
        String wholeKey = KEY_PREFIX + key;
        Object value = redisTemplate.opsForValue().get(wholeKey);
        log.info("redis get {} ==> {}", wholeKey, value);
        return value;
    }

}
