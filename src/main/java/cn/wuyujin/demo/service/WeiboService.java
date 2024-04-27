package cn.wuyujin.demo.service;

import cn.wuyujin.demo.bean.entity.Weibo;

import java.util.List;

public interface WeiboService {
    List<Weibo> getWeiboList(String uid);
}
