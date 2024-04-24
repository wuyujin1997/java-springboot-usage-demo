package cn.wuyujin.demo.bean.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Slf4j
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Weibo {
    private String id;
    private String pubRegion;
    private String pubDevice;
    private LocalDateTime pubTime;
    private String text;
}
