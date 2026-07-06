# Loan Microservice

## Introduction

The **Loan Microservice** is a RESTful web service developed using **Spring Boot** as part of a Microservices architecture learning exercise. The primary objective of this project is to demonstrate how an independent microservice can expose REST APIs to provide loan-related information without relying on a backend database.

In this implementation, the service returns predefined (dummy) loan details based on the loan account number received in the request URL. This project helps in understanding the fundamental concepts of Spring Boot, REST APIs, Maven, and Microservices.

---

# Objective

The main objectives of this project are:

- To understand the architecture of Microservices.
- To develop an independent Spring Boot REST API.
- To implement REST endpoints using Spring MVC.
- To return JSON responses to client requests.
- To configure and run multiple microservices on different server ports.
- To build and execute Spring Boot applications using Maven.

---

# About the Project

The Loan Microservice is designed to simulate a banking application that provides loan account information. Whenever a client sends a GET request with a loan account number, the service processes the request and returns the corresponding loan details in JSON format.

Since this is a learning project, no database connectivity has been implemented. All responses are generated using hardcoded values within the application.

---

# Technologies Used

- Java 21
- Spring Boot 3.5.3
- Spring Web
- Spring Boot DevTools
- Maven
- REST API
- JSON

---

#  Project Structure

```
loan
│
├── src
│   └── main
│       ├── java
│       │   └── com.cognizant.loan
│       │       ├── LoanApplication.java
│       │       ├── controller
│       │       │      └── LoanController.java
│       │       └── model
│       │              └── Loan.java
│       │
│       └── resources
│              └── application.properties
│
└── pom.xml
```

---

#  Workflow

1. The client sends an HTTP GET request to the Loan Microservice.
2. The request contains the loan account number in the URL.
3. The request is received by the `LoanController`.
4. The controller creates a Loan object with predefined values.
5. Spring Boot automatically converts the object into JSON format.
6. The JSON response is returned to the client.

---

# REST API

### Method

```
GET
```

### Endpoint

```
/loans/{number}
```

### Sample Request

```
http://localhost:8081/loans/H00987987972342
```

---

#  Sample Response

```json
{
  "number": "H00987987972342",
  "type": "car",
  "loan": 400000,
  "emi": 3258,
  "tenure": 18
}
```

---

#  Running the Application

### Build the project

```bash
mvn clean package
```

### Run the application

```bash
mvn spring-boot:run
```

---

# Expected Output

After successfully starting the application, Spring Boot displays:

```
Tomcat started on port(s): 8081 (http)
Started LoanApplication
```

Testing the endpoint:

```
GET http://localhost:8081/loans/H00987987972342
```

returns

```json
{
  "number": "H00987987972342",
  "type": "car",
  "loan": 400000,
  "emi": 3258,
  "tenure": 18
}
```

---

# ✨ Features

- Independent Spring Boot Microservice
- RESTful API implementation
- JSON response generation
- Maven-based project structure
- Simple and lightweight architecture
- Easy to extend with database connectivity in future

---

# Learning Outcomes

Through this project, I gained practical experience in:

- Understanding the Microservices architecture.
- Developing REST APIs using Spring Boot.
- Creating controllers and model classes.
- Handling URL path variables.
- Returning JSON responses.
- Configuring application ports using `application.properties`.
- Building and running Spring Boot applications with Maven.
- Testing REST APIs using a web browser and Postman.

---

# Future Enhancements

- Integrate a relational database using Spring Data JPA.
- Add CRUD operations for loan management.
- Implement exception handling.
- Add request validation.
- Secure APIs using Spring Security.
- Integrate with other banking microservices such as Account and Customer services.
- Generate API documentation using Swagger/OpenAPI.

---

