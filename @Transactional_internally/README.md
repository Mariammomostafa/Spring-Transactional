# Spring JPA project
- It's spring maven project using JPA to apply Data base operations
- used java-based configurations to configure all neccessary beans needed for JPA
- create DriverManagerDataSource bean  
- create bean of LocalContainerEntityManagerFactoryBean to create EntityManagerFactory obj based on :
        - given Datasource , hibernate properties , package to scan Entities , JpaVendorAdaptor
- create EntityManager obj from EntityManagerFactory obj
- use EntityManager obj to apply CRUD operations
- create bean of TransactionManager & use @Transactional annotation to let spring mange transactions
- use @Transactional annotation ONLY in Dao layer
- instead of using @Transactional annotation in Serivce layer , will do it manually through :
    - create Proxy (ServiceProxy) class of Service layer (StudentService)
    - inside overriden method of Proxy :
         - use Reflection Method to get metadata of the target method
         - create anonymous inner class of MethodInvocation interface which will be passed to TransactionInterceptor obj
         - this Proxy class uses TransactionInterceptor to invok the actual target method
- create Repository layer in which using EntityManager to apply CRUD operations


 ### Prerequisites
- Java 17
- spring-context 6.2.7
- spring-orm 6.2.9
- hibernate-core 7.0.6.Final
- jakarta.persistence-api 3.2.0
- mysql-connector-j 8.3.0
- IDE (Eclips)
 
