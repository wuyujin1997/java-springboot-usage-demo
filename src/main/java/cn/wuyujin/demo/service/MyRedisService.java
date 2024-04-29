package cn.wuyujin.demo.service;

public interface MyRedisService {
    void set(String key, Object value);
    Object get(String key);
}
