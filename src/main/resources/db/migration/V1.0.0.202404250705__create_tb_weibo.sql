-- database_of_wuyujin1997.tb_weibo definition

CREATE TABLE `tb_weibo` (
  `id` char(50) NOT NULL,
  `uid` char(50) NOT NULL,
  `pub_region` char(100) DEFAULT NULL,
  `pub_device` char(50) DEFAULT NULL,
  `pub_time` datetime DEFAULT NULL,
  `content` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
);
--) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- insert 3 record
INSERT INTO database_of_wuyujin1997.tb_weibo (id, uid, pub_region, pub_device, pub_time, content)
VALUES('20240425072033', 'wuyujin1997', '上海', 'iPhone', '2024-04-25 07:21:13', 'Hello mysql');

INSERT INTO database_of_wuyujin1997.tb_weibo (id, uid, pub_region, pub_device, pub_time, content)
VALUES('20240425072051', 'wuyujin1997', '上海', 'huawei', '2024-04-25 07:21:36', '你好世界');

INSERT INTO database_of_wuyujin1997.tb_weibo (id, uid, pub_region, pub_device, pub_time, content)
VALUES('20240425072154', 'wuyujin1997', '上海', 'xiaomi', '2024-04-25 07:21:56', 'Hello, my friend.');
