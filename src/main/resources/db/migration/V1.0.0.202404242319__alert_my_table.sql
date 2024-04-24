-- 一般会在 flyway 脚本文件中准备写操作的SQL：create/drop/alter, insert/update/delete 等。
-- 当一个 flyway 脚本文件在数据库中运行过之后，就不能再改变其内容，否则会因为和 flyway_schema_history.checksum 中的执行记录不一致而报错。
-- 除非你同时清理 flyway_schema_history 中的脚本执行记录。清理方法不懂可以问我。联系方式见本项目的 README.md 文件
alter table tb_person add column married boolean default false;

-- alter table tb_person drop column married ;
