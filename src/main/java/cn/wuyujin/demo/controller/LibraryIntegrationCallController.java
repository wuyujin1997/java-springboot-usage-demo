package cn.wuyujin.demo.controller;

import cn.wuyujin.demo.bean.constant.PathConstant;
import cn.wuyujin.demo.service.MyKafkaProducer;
import cn.wuyujin.demo.service.MyRedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(PathConstant.V1_INTEGRATE)
public class LibraryIntegrationCallController {

    @Autowired
    private MyRedisService myRedisService;

    @Autowired
    private MyKafkaProducer myKafkaProducer;

    @GetMapping(value = PathConstant.INTEGRATE_REDIS, produces = MediaType.APPLICATION_JSON_VALUE)
    public String integrateRedisTest(@RequestParam String name, @RequestParam String value) {
        myRedisService.set(name, value);
        return String.valueOf(myRedisService.get(name));
    }

    @GetMapping(PathConstant.INTEGRATE_KAFKA_STRING)
    public String integrateKafkaTest(String message) {
        myKafkaProducer.sendStringMessage(message);
        return null;
    }

}