# Spring Jdbc project
- this is Spring Jdbc project using @Transactional annotation over methods which apply CRUD operation on data exis in data base
- @Transactional annotation enable spring to take the control for transaction process from create connection , begin transaction , commit or rollback
- @Transactional annotation gurantee that all steps inside method annotated with will be apply/commit all or reject all
- create dao layer which uses JdbcTemplate to apply CRUD operations
- create bean of JdbcTemplate & bean of DataSource for connection obj
- create bean of DataSourceTransactionManager which accept obj of DataSource
- create product table in DB
- create  Product class to transfer data from java to DB
