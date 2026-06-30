Spring RESTful Web Services – Employee & Department Management (Exercise 3)

Project Objective

This hands-on exercise demonstrates building a scalable, multi-tiered RESTful Web Service using Spring Boot. It implements a decoupled **Controller ➡️ Service ➡️ DAO (Data Access Object)** architecture to load static mock data components dynamically from external Spring XML configurations (`employee.xml` and `department.xml`) and stream them out as raw JSON payloads to client endpoints.

Core Component Implementation

1. Spring XML Configuration Blueprints

The system extracts object instantiations from external metadata files, injecting specific constructor properties to form base global collections:

src/main/resources/employee.xml`: Instantiates shared skill sets and multiple detailed employee objects, wrapping them inside a main `employeeList` array bean.

src/main/resources/department.xml`: Instantiates independent enterprise groups into a unified `departmentList` array bean.

2. Multi-Tier Spring Rest Architecture Codebase
   
Model Layer (`Employee`, `Department`, `Skill`): Plain Old Java Objects (POJOs) defining the data attributes and object relationships.

DAO Layer (`EmployeeDao`, `DepartmentDao`): Classes annotated with `@Repository` that spin up an independent `ClassPathXmlApplicationContext` container to extract bean collections during startup.

Service Layer (`EmployeeService`, `DepartmentService`): Intermediate business logic layer annotated with `@Service` providing clean separation of concerns.

Controller Layer (`EmployeeController`, `DepartmentController`): Endpoints annotated with `@RestController` that map incoming client requests to backend services via `@GetMapping`.

### 3. Server Configuration (`src/main/resources/application.properties`)

properties

server.port=0
