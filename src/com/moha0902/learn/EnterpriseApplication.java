package com.moha0902.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class EnterpriseApplication {

	public static void main(String[] args) {

		ApplicationContext context= new ClassPathXmlApplicationContext("Employee.xml");
		Employee employee1 = (Employee) context.getBean("employee1");
		System.out.println(employee1);

	}

}
