# Basic Spring Boot Rest Service

Simple REST API template.

To run you need  
Java 8  
Maven  
Git  

## Starting the service
Jar ``java -jar template.jar``  
Starting the Maven project: ``mvn spring-boot:run``

## Package a runnable JAR file
``mvn package``

## Configuration
Configuration at file `application.yml`.   
Port to listen to.

## Rest calls 

Test API
`curl http://localhost:8471/sample-api/1.0/info`  

Fetch single tip 
`curl http://localhost:8471/sample-api/1.0/id/7`  

