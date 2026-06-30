package com.cognizant.springlearn;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {

    private static final Logger logger = LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) {
        logger.info("Inside main() method of SpringLearnApplication: Starting application...");
        
        SpringApplication.run(SpringLearnApplication.class, args);
        
        // Execute the mandatory handson display method
        displayDate();
        
        logger.info("SpringLearnApplication completed successfully!");
    }

    public static void displayDate() {
        logger.info("START - displayDate()");
        
        // Load the Spring XML configuration file from the classpath
        ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
        
        // Retrieve the bean created by the IoC Container
        SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
        
        try {
            // Parse string input to standard Date object using bean formatting
            Date date = format.parse("31/12/2018");
            System.out.println("Parsed Date: " + date);
        } catch (Exception e) {
            logger.error("Error parsing date: ", e);
        }
        
        logger.info("END - displayDate()");
    }
}