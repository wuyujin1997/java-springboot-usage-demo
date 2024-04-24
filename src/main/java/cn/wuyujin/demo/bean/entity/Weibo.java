package cn.wuyujin.demo.bean.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.time.LocalDateTime;

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
