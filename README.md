
## 项目介绍

编程语言：Java

依赖管理工具：Maven

框架：SpringBoot 及其生态相关依赖

## 仓库地址

存储在两个远程仓库中：github && gitee。

`git clone git@gitee.com:wuyujin1997/java-springboot-usage-demo.git`

`git clone git@github.com:wuyujin1997/java-springboot-usage-demo.git`


## 访问

swagger:

http://localhost:8888/wuyujin/swagger-ui.html

GET http://localhost:8888/wuyujin/v1/demo/hello?name=于禁

GET http://localhost:8888/wuyujin/v1/demo/testJson?name=Eugene&age=22

## 集成记录

```shell
# SpringBoot 父依赖 + 基本功能starter
org.springframework.boot:spring-boot-starter-parent
org.springframework.boot:spring-boot-starter

# SpringBoot 单元测试
org.springframework.boot:spring-boot-starter-test

# SpringMVC 相关
org.springframework.boot:spring-boot-starter-web

# JavaBean 注解相关
org.projectlombok:lombok

# JSON 序列化
com.alibaba:fastjson

# web API 的网页文档生成
io.springfox:springfox-swagger2
io.springfox:springfox-swagger-ui

```