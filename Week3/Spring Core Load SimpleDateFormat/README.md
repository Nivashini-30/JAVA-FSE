Spring Core – Load SimpleDateFormat from Spring Configuration XML (Exercise 2)
Project Overview
This exercise demonstrates the fundamental concepts of Spring Core Inversion of Control (IoC) and Dependency Injection (DI). To avoid creating multiple instances of `java.text.SimpleDateFormat` throughout an application, a single bean is declared inside an external Spring XML configuration file (`date-format.xml`) using Constructor Argument Injection. The application context loads this configuration file at runtime and retrieves the bean dynamically to parse a date string.

Repository File Structure
text
spring-learn/
├── .gitignore
├── pom.xml
└── src/
    ├── main/
    │   ├── java/
    │   │   └── com/
    │   │       └── cognizant/
    │   │           └── springlearn/
    │   │               └── SpringLearnApplication.java
    │   └── resources/
    │       ├── application.properties
    │       └── date-format.xml
    └── test/
        └── java/
            └── com/
                └── cognizant/
                    └── springlearn/
                        └── SpringLearnApplicationTests.java


OUTCOME:
Parsed Date: Mon Dec 31 00:00:00 IST 2018
