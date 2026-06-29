Spring Core – Load SimpleDateFormat from Spring Configuration XML 

Project Overview

This exercise demonstrates the fundamental concepts of Spring Core Inversion of Control (IoC) and Dependency Injection (DI). To avoid creating multiple instances of `java.text.SimpleDateFormat` throughout an application, a single bean is declared inside an external Spring XML configuration file (`date-format.xml`) using Constructor Argument Injection. The application context loads this configuration file at runtime and retrieves the bean dynamically to parse a date string.

OUTCOME:
Parsed Date: Mon Dec 31 00:00:00 IST 2018
