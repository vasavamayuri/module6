 package com.prog.Spring_Core.primitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String args[])
	{
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/prog/Spring_Core/primitive/config.xml");
		
		Student s1=context.getBean("std1",Student.class);
		System.out.println(s1);
	}
	
}
