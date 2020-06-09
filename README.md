# spring-boot-liquibase-sample
Spring boot application with Liquibase and mysql configuration


## Setup
- Create a new mysql database
```
create database `library-liquibase-db`;
```

- Please update the following configuration keys before startup the application :
```
spring.datasource.url=jdbc:mysql://localhost:3306/library-liquibase-db;
spring.datasource.username=root
spring.datasource.password=pass
```
