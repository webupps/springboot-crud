# The Art of Software in Action - Spring Boot REST API
Free Demo project of Spring Boot with MariaDB in REST API

## Requirements 
Java Version
 - openjdk 17.0.10 2024-01-16
Editor
 - spring-tool-suite-4-4.22.0
MariaDB:
- Server version: 11.2.2-MariaDB Homebrew

### Make sure Mariadb is installed and running
Create Database - Note: Use the Database name in your application.properties

### Edit app/src/main/resources/application.properties
spring.datasource.username=<username>
spring.datasource.password=<password>
server.port=<port>
spring.datasource.url=jdbc:mysql://127.0.0.1:3306/<databasename>

### Using spring-tool-suite (Run the folder in the following order)
Run AS: 
Maven Clean
Maven Generate Sources 
Maven Verify
Springboot App

### Use Postman to POST item
Or Use the curl to post item
```
curl --location 'http://localhost:8085/v1/users/add' \
--header 'Content-Type: application/json' \
--data '{
    "name": "John Doe",
    "username": "jdoe",
    "password": "jdasdfas!"
}'
```