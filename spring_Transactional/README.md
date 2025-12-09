# Spring @Transactional project
- this is Spring Jdbc project using @Transactional annotation over methods which apply CRUD operation on data exis in data base
- @Transactional annotation enable spring to take the control for transaction process from create connection , begin transaction , commit or rollback
- @Transactional annotation gurantee that all steps inside method annotated with will be apply/commit all or reject all
- create dao layer which uses JdbcTemplate to apply CRUD operations
- create bean of JdbcTemplate & bean of DataSource for connection obj
- create bean of DataSourceTransactionManager which accept obj of DataSource
- create product table in DB
- create  Product class to transfer data from java to DB
- create ProductService class which contains method for create some product & save them by calling ProductRepo
- saveProductInfo() method of Service layer annotated by @Transactional & contains condition to throw exception if i = 7
- as there is @Transactional , all proccess will rollback & none of the products will be saved
- you can try comment this condition & notice that all save proccess will commit & all products will be saved in DB 

## Prerequisites
- Java 17
- spring-context 6.2.9
- spring-jdbc 6.2.9
- spring-aop 6.2.9
- mysql-connector-j 9.1.0
- IDE (Eclips)
