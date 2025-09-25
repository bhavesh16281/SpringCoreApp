package com.bhavesh16281;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Employee {
	
	public static void main(String args[]) {
		
		/* This is the depcricated way of creating beans in Spring Framework
		BeanFactory factory = new XMLBeanFactory(new FileSystemResource("spring.xml"));
		Laptop laptop = (Laptop) factory.getBean("laptop");
		*/
		
		/* This is the new method for creating beans in Spring Framework
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Laptop laptop = (Laptop) context.getBean("laptop");
		laptop.print();
		*/
		
		
		/*Spring Container- JVM will first create a Spring container when we create the object of Application Context 
			inside the spring container all the java beans will be created which are mentioned in spring.xml file even though we
			we do not instantiate/ask spring to getBean of a class
		ApplicationContext con = new ClassPathXmlApplicationContext("spring.xml");
		*/
		
		/* Spring by default follows Singleton design pattern
			If we run the below code the price of l1 and l2 both will be 50000 because 
			Spring by default creates only one bean/object for a particular class and the same bean will be returned 
			everytime when we ask spring to getBean() instead of creating new bean
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Laptop l1 = (Laptop) context.getBean("laptop");
		l1.price =  50000;
		System.out.println("price of laptop for l1 object is: "+ l1.price);
		
		Laptop l2 = (Laptop) context.getBean("laptop");
		System.out.println("price of laptop for l2 object is: "+ l2.price);
		*/
		
		
		/* To avoid Spring frameworks default singleton pattern we use scope attibute for each bean tag inside spring.xml
		 * where we mention 'prototype' as value
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Laptop l1 = (Laptop) context.getBean("laptop");
		l1.price =  50000;
		System.out.println("price of laptop for l1 object is: "+ l1.price);
		
		Laptop l2 = (Laptop) context.getBean("laptop");
		System.out.println("price of laptop for l2 object is: "+ l2.price);
		 */
		
		/*Property tag in spring.xml to set  the price value using setter
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Laptop l1 = (Laptop) context.getBean("laptop");
		System.out.println("price of laptop for l1 object is: "+ l1.getPrice());
		*/
		
		/*constructor tag on spring.html to set the price value using constructor
		ApplicationContext context1 = new ClassPathXmlApplicationContext("spring.xml");
		Laptop l3 = (Laptop) context1.getBean("laptop");
		System.out.println("price of laptop for l1 object is: "+ l3.getPrice());
		System.out.println("brand: "+l3.getBrand());
		*/
		
		/*Setting or creating the object of a class which is inside another class
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Laptop lap = (Laptop) context.getBean("laptop");
		lap.print();
		*/
		
		/*Autowire - If an object is internally dependent on any other object then using autowire, 
		spring can create the dependent objects automatically
		ApplicationContext context = new ClassPathXmlApplicationContext("spring2.xml");
		ComputerImpl ci = (ComputerImpl) context.getBean("comImpl");
		ci.print();
		*/
		
		//To overcome exceptions when multiple beans exist in xml file using autowire, we use primary key to set the preference to one bean
		ApplicationContext context = new ClassPathXmlApplicationContext("spring2.xml");
		ComputerImpl ci = (ComputerImpl) context.getBean("comImpl");
		ci.print();
		
	}

}
