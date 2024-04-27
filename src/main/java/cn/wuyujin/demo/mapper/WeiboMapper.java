package cn.wuyujin.demo.mapper;

import cn.wuyujin.demo.bean.entity.Weibo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WeiboMapper {

    // 查询某个 uid 的 weibo 记录
    List<Weibo> getWeiboOfUid(@Param("uid") String uid);

}
