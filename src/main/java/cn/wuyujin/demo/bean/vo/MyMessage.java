package cn.wuyujin.demo.bean.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MyMessage implements Serializable {
    private static final long serialVersionUID = 6497971974057513398L;
    private String name;
    private Integer age;
    private Boolean married;
    private ContactInfo contactInfo;
}

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
class ContactInfo {
    private String tel;
    private String email;
    private String wechat;
}
