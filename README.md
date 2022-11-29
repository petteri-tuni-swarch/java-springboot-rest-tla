# Basic Spring Boot Rest Service

Simple REST API template.

To run you need  
Java 11 (minimum 8)  
Maven  
Git  

## Clone and build
````
git clone https://github.com/petteri-tuni-swarch/java-springboot-rest-tla.git
mvn install
````

## Start the service
````java -jar target/bare-rest-0.0.2-SNAPSHOT.jar````

## Start the service in continuous development deploy mode (needs some IDE config to work properly)
````mvn spring-boot:run````


## Configuration
Configuration at file `application.yml`.   
Port to listen to.

## Rest calls 

Test API:

````curl http://localhost:8471/sample-api/1.0/info````  

Fetch single ... something:

````curl http://localhost:8471/sample-api/1.0/id/7````  

POST request:

curl -H "Content-Type: application/json" -X POST -d '{"data":"sometext", "range": "300"}' localhost:8471/sample-api/1.0/post



# Links / tutorials 

* https://github.com/amigoscode/jdbc - Spring Boot REST API with JDBC Template
* https://mkyong.com/java/java-11-httpclient-examples/ - Java 11 HttpClient Examples
* https://www.baeldung.com/java-httpclient-post - Posting with Java HttpClient
* https://openjdk.org/groups/net/httpclient/recipes.html - Examples and recipes
* https://spring.io/guides/gs/rest-service/ - Spring documentation


