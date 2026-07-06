# Account Microservice

## Overview

The Account Microservice is a Spring Boot RESTful web service developed as part of a Microservices learning exercise. It provides account details based on the account number using a REST API. This project does not use a database and returns predefined JSON data.

---

## Technologies Used

- Java 21
- Spring Boot
- Spring Web
- Maven
- REST API

---

## Project Structure

```
account
├── src
│   ├── main
│   │   ├── java
│   │   └── resources
│   └── test
├── pom.xml
└── README.md
```

---

## REST API

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/accounts/{number}` | Returns account details for the given account number. |

### Sample Request

```
GET http://localhost:8080/accounts/00987987973432
```

### Sample Response

```json
{
  "number": "00987987973432",
  "type": "savings",
  "balance": 234343
}
```

---

## How to Run

```bash
mvn clean package
mvn spring-boot:run
```

---

## Features

- RESTful API using Spring Boot
- Returns JSON response
- Independent Microservice
- Maven-based project

---

## Author

**Nivashini R**
