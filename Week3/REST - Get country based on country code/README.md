# Spring RESTful Web Services – Advanced Country Routing Track

##  Project Overview

This module expands the REST web services configuration by integrating multi-layered dependency controls (**Controller ➡️ Service**) to manage object collections. It showcases dynamic routing via path parameter capturing, case-insensitive value matching, and clean dataset parsing utilizing Java 8 Stream API Lambda structures.

## 🛠️ Implementation Architecture

### 1. Spring List Collection Configuration (`src/main/resources/country.xml`)

Consolidates distinct structural country bean blueprints (`in`, `us`, `jp`, `de`) inside a centralized `java.util.ArrayList` bean container identified as `countryList`.

### 2. Business Service Layer (`src/main/java/com/cognizant/springlearn/service/CountryService.java`)

* **`getAllCountriesList()`**: Initializes a localized `ClassPathXmlApplicationContext` container instance to extract the `countryList` metadata array.
* 
* **`getCountry(String code)`**: Applies a Java Stream Lambda filter sequence to evaluate country object collections case-insensitively using `.equalsIgnoreCase(code)`.

### 3. REST Controller Mappings (`src/main/java/com/cognizant/springlearn/controller/CountryController.java`)

* **`@GetMapping("/countries")`**: Invokes the service tier to return the complete array collection.
* 
* **`@GetMapping("/countries/{code}")`**: Leverages a `@PathVariable` annotation injection hook to bind incoming dynamic request paths directly into the service processing layer.

## 🎯 Verified System Outcome

### 1. Runtime Application Console Output

text

2026-06-30T11:57:23.210+05:30  INFO 3476 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 0 (http)

2026-06-30T11:57:23.606+05:30  INFO 3476 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 63863 (http) with context path '/'

2026-06-30T11:57:23.615+05:30  INFO 3476 --- [  restartedMain] c.c.springlearn.SpringLearnApplication   : SpringLearnApplication started successfully!

to verify the outcome open the chrome and type:

http://localhost:<Your-Port-number>/countries
