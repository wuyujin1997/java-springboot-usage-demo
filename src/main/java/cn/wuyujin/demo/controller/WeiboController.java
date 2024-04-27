package cn.wuyujin.demo.controller;

import cn.wuyujin.demo.bean.constant.PathConstant;
import cn.wuyujin.demo.bean.entity.Weibo;
import cn.wuyujin.demo.service.WeiboService;
import com.alibaba.fastjson2.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(PathConstant.V1_WEIBO)
public class WeiboController {

    @Autowired
    private WeiboService weiboService;

    @GetMapping(PathConstant.WEIBO_GET_WEIBO_LIST)
    public List<Weibo> getWeiboList(
            @RequestParam String uid,
            @RequestHeader HttpHeaders httpHeaders
    ) {
        log.info("{}  request: {} {}", PathConstant.WEIBO_GET_WEIBO_LIST, uid, JSON.toJSON(httpHeaders));
        List<Weibo> weiboList = weiboService.getWeiboList(uid);
        log.info("{} response: {}", PathConstant.WEIBO_GET_WEIBO_LIST, JSON.toJSON(weiboList));
        return weiboList;
    }


}
