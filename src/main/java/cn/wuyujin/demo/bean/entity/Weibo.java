package cn.wuyujin.demo.bean.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;
import java.time.LocalDateTime;

// 对于已经用 mybatis.type-aliases-package 指定的包下的类，会自动生成同名的alias。如果想自己定一一个别名，可以用 @Alias 注解。
@Alias("myWeiboType")
@Slf4j
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Weibo implements Serializable {
    private static final long serialVersionUID = 6588089172368981189L;
    private String id;
    private String uid;
    private String pubRegion;
    private String pubDevice;
    private LocalDateTime pubTime;
    private String content;
}
