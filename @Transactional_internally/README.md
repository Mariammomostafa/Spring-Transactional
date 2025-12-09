# Spring JPA project
- It's spring maven project using JPA to apply Data base operations
- used java-based configurations to configure all neccessary beans needed for JPA
- create DriverManagerDataSource bean  
- create bean of LocalContainerEntityManagerFactoryBean to create EntityManagerFactory obj based on :
        - given Datasource , hibernate properties , package to scan Entities , JpaVendorAdaptor
- create EntityManager obj from EntityManagerFactory obj
- use EntityManager obj to apply CRUD operations
- create bean of TransactionManager & use @Transactional annotation to let spring mange transactions
- create Repository layer in which using EntityManager to apply CRUD operations


 ### Prerequisites
- Java 17
- spring-context 6.2.7
- spring-orm 6.2.9
- hibernate-core 7.0.6.Final
- jakarta.persistence-api 3.2.0
- mysql-connector-j 8.3.0
- IDE (Eclips)
 
