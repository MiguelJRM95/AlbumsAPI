# <ins>*AlbumsAPI*</ins> # 

### Description
> This repository aims to be a sample kotlin project using JSON placeholder API
> in order to expose a Rest API with albums and it's photos.

## How To Run The Project
1. Inside the project's directory:
    * If you have Maven installed in your machine run:
   ```shell
   mvn clean install && java -jar target/AlbumsAPI-0.0.1-SNAPSHOT.jar
   ```
    * If you DON'T have maven installed in your machine run:
   ```shell
   ./mvnw clean install && java -jar target/AlbumsAPI-0.0.1-SNAPSHOT.jar
   ```


## How To Run The Unit Tests
* If you want just to run the application tests you can do so by using this command:

    * If you have Maven installed in your machine run:
    ```shell
    mvn test 
    ```
    * If you DON'T have maven installed in your machine run:
    ```shell
    ./mvnw test
    ```

## How To Run The Integration Tests
* If you want just to run the integration tests you can do so by using this command:

    * If you have Maven installed in your machine run:
    ```shell
    mvn verify 
    ```
    * If you DON'T have maven installed in your machine run:
    ```shell
    ./mvnw verify
    ```
 * During this phase you can also see the JACOCO report under */target/site/jacoco*

> #### About the tests:
>> Inside the project you will find examples of **unit tests** for the controller adapter and service and also **integration tests** for the controller.

### API Documentation:
The API documentation is available through the following URL once the project is running: http://localhost:9090/actuator/swagger-ui

## Technical Overview
1. **The project follows a <ins>hexagonal architecture with DDD</ins>.**
2. **Uses Swagger following Code First for the documentation about the endpoints.**
3. **To communicate with the JSONPlaceholder API takes advantage of Spring Cloud OpenFeign.**
4. **Thanks to Spring Boot Actuator the Swagger port and any management tools can be moved to the one the developers team wants.**
5. **You can see an example of TDD in the commit [9c4e617](https://github.com/MiguelJRM95/AlbumsAPI/commit/9c4e617f11494fd7fa61d20e4f61bafea6f4f74b)
     and the next one**

## To Be Done
1. Increase the test coverage.
2. Possibility to create new Albums and add or remove photos.