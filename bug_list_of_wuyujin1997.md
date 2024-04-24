
## mysql JDBC + flyway integration

### 当数据库中已经存在表时，会报如下错误。需要设置 baselineOnMigrate=true 才会成功执行 flyway。

org.flywaydb.core.api.FlywayException: Found non-empty schema(s) `db_java_sb_demo` without schema history table! Use baseline() or set baselineOnMigrate to true to initialize the schema history table.


### mysql server 8.3 可以搭配哪些版本的 flyway?

flyway 5.2.4
Flyway upgrade recommended: MySQL 8.3 is newer than this version of Flyway and support has not been tested.

flyway 7.2.0 <选这个吧>
Flyway upgrade recommended: org.flywaydb.core.internal.database.mysql.MySQLDatabaseType@32dcfeea 8.3 is newer than this version of Flyway and support has not been tested. The latest supported version of org.flywaydb.core.internal.database.mysql.MySQLDatabaseType@32dcfeea is 8.0.

flyway 8.3
Unsupported Database: MySQL 8.3
