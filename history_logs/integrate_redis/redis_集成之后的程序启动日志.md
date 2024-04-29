
## 日志

[springboot启动日志:Multiple Spring Data modules found, entering strict repository configuration mode](https://www.coderbbb.com/articles/26)

```log
2024-04-29 21:49:06.022  INFO 34474 --- [           main] cn.wuyujin.demo.Wuyujin1997Application   : No active profile set, falling back to 1 default profile: "default"
2024-04-29 21:49:09.073  INFO 34474 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Multiple Spring Data modules found, entering strict repository configuration mode
2024-04-29 21:49:09.077  INFO 34474 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data Redis repositories in DEFAULT mode.
2024-04-29 21:49:09.143  INFO 34474 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 44 ms. Found 0 Redis repository interfaces.
2024-04-29 21:49:10.901  INFO 34474 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8888 (http)
```

## web接口测试

```javascript
fetch("http://localhost:8888/wuyujin/redis/redis?name=site&value=wuyujindotcom", {
  "headers": {
    "accept": "application/json",
    "accept-language": "en",
    "cache-control": "no-cache",
    "pragma": "no-cache",
    "sec-ch-ua": "\"Chromium\";v=\"124\", \"Google Chrome\";v=\"124\", \"Not-A.Brand\";v=\"99\"",
    "sec-ch-ua-mobile": "?0",
    "sec-ch-ua-platform": "\"macOS\"",
    "sec-fetch-dest": "empty",
    "sec-fetch-mode": "cors",
    "sec-fetch-site": "same-origin"
  },
  "referrer": "http://localhost:8888/wuyujin/swagger-ui.html",
  "referrerPolicy": "strict-origin-when-cross-origin",
  "body": null,
  "method": "GET",
  "mode": "cors",
  "credentials": "include"
});
```