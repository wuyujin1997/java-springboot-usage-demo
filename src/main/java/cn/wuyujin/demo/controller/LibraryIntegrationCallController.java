package cn.wuyujin.demo.controller;

import cn.wuyujin.demo.bean.constant.PathConstant;
import cn.wuyujin.demo.service.MyRedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(PathConstant.INTEGRATE_REDIS)
public class LibraryIntegrationCallController {

    @Autowired
    private MyRedisService myRedisService;

    @GetMapping(value = PathConstant.INTEGRATE_REDIS, produces = MediaType.APPLICATION_JSON_VALUE)
    public String integrateRedisTest(@RequestParam String name, @RequestParam String value) {
        myRedisService.set(name, value);
        return String.valueOf(myRedisService.get(name));
    }

}
