# Spring RESTful Web Services – Country Web Service

## Project Objective

To implement a RESTful Web Service endpoint that reads object beans defined within external Spring XML configuration metadata (`country.xml`) and streams them back to client interfaces as fully serialized JSON payloads.

## Implementation Layout

### 1. Data Object Model (`src/main/java/com/cognizant/springlearn/model/Country.java`)

Defines the `Country` entity with properties for country `code` and `name`, complete with standard Java getter/setter accessors and a trace log constructor.

### 2. Spring Bean Blueprint XML Configuration (`src/main/resources/country.xml`)

Declares the configuration bean metadata, initializing object instance state values via property injection settings:

xml

<bean id="in" class="com.cognizant.springlearn.model.Country">
  
    <property name="code" value="IN"/>
    
    <property name="name" value="India"/>
    
</bean>

To verify this use the port number through the Localhost

http://localhost:<Your-Port-Number>/country

The Outcome will be:

{"code":"IN","name":"India"}
