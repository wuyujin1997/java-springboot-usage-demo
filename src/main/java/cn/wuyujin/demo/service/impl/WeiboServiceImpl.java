package cn.wuyujin.demo.service.impl;

import cn.wuyujin.demo.bean.entity.Weibo;
import cn.wuyujin.demo.mapper.WeiboMapper;
import cn.wuyujin.demo.service.WeiboService;
import com.alibaba.fastjson2.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class WeiboServiceImpl implements WeiboService {

    @Autowired
    private WeiboMapper weiboMapper;

    @Override
    public List<Weibo> getWeiboList(String uid) {
        List<Weibo> weiboList = null;
        try {
            weiboList = weiboMapper.getWeiboOfUid(uid);;
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.info("weiboList {}", JSON.toJSON(weiboList));
        return weiboList;
    }

}
