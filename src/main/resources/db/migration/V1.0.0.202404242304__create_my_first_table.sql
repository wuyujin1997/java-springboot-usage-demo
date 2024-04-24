-- 本表仅用于测试： flyway 会在应用启动时自动执行特定目录下的sql脚本（用 spring.flyway.locations 指定目录）
create table if not exists tb_person (
	id int auto_increment primary key,
	name char(20) not null,
	age int
);