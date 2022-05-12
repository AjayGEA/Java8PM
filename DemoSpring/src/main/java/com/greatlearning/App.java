package com.greatlearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {    
     ApplicationContext context=new ClassPathXmlApplicationContext("web.xml");
    Student s1=(Student)context.getBean("studentBean");//setter
    Student s2=(Student)context.getBean("studentBean1");//constructor
    Employee s3=(Employee)context.getBean("employeeBean");//setter
    Employee s4=(Employee)context.getBean("employeeBean1");//constructor
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s4);
          
    }
}
