package cn.wuyujin.demo.controller;

import cn.wuyujin.demo.bean.Person;
import com.alibaba.fastjson2.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/v1/demo")
public class DemoController {

    @GetMapping("/hello")
    public String hello(String name) {
        return "你好啊，" + name;
    }

    @GetMapping("/testJson")
    public Person testJson(String name, Integer age) {
        Person person = Person.builder()
                .name(name)
                .age(age)
                .married(false)
                .build();
        log.info("测试JSON序列化：{}", JSON.toJSON(person));
        return person;
    }

}
