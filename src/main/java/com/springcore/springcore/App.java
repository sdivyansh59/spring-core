package com.springcore.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student student = (Student) context.getBean("student1");
        
        System.out.println(student);
        
        // creating 2nd beean
        Student studentTwo = (Student) context.getBean("student2");
        System.out.println(studentTwo);
        
     // creating 3ed beean
        Student studentThree = (Student) context.getBean("student3");
        System.out.println(studentThree);
        
    }
}
