# ShopAPI

## Description

Backend test task for SHIFT Lab 2022.  
Simple API for an electronics store.  
Spring Boot + PostgreSQL.

## Specification
Swagger specification is available here:
```
http://localhost:8080/swagger-ui/index.html
```

## Installation

You can clone this repository and use it localy:
```sh
$ git clone https://github.com/NAntigravity/ShopAPI.git
```

**Using Maven plugin**

First you should do clean installation:
```sh
$ mvn clean install
```
You can start application using Spring Boot custom command:
```sh
$ mvn spring-boot:run
```

**Using docker**

You can start application using docker-compose:
```sh
$ docker-compose up -d
```

## Configuration

To configure the application, use <a href="src/main/resources/application.properties">application.properties</a>
