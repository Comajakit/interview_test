# README.md Sample for interview test

## Overview

This is my normal project structure and not relate to this test project for interview.

## Project Structure

The project is organized as follows:
```plaintext
project-root/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           ├── config/
│   │   │           │   └── AppConfig.java
│   │   │           ├── constants/
│   │   │           │   └── Constants.java
│   │   │           ├── controller/
│   │   │           │   └── MyController.java
│   │   │           ├── entity/
│   │   │           │   └── SomeEntity.java
│   │   │           ├── model/
│   │   │           │   └── MyModel.java
│   │   │           ├── repository/
│   │   │           │   └── MyRepository.java
│   │   │           ├── service/
│   │   │           │   └── MyService.java
│   │   │           └── Application.java
│   │   └── resources/
│   │       ├── application.properties
│   │       ├── application-local.properties
│   │       └── application-dev.properties
│   │
│   ├── test/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           ├── controller/
│   │   │           │   └── UserControllerTest.java
│   │   │           ├── service/
│   │   │           │   └── UserServiceTest.java
│   │   └── resources/
│   │       └── application-test.properties
│   │
├── pom.xml
├── README.md
└── .gitignore