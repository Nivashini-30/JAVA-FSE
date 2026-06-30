package com.cognizant.springlearn.dao;

import com.cognizant.springlearn.model.Employee;
import java.util.ArrayList;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
    private static ArrayList<Employee> EMPLOYEE_LIST = new ArrayList<>();

    @SuppressWarnings("unchecked")
    public EmployeeDao() {
        ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
        EMPLOYEE_LIST = context.getBean("employeeList", ArrayList.class);
    }

    public ArrayList<Employee> getAllEmployees() {
        return EMPLOYEE_LIST;
    }
}