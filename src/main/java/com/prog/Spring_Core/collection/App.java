package com.prog.Spring_Core.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prog.Spring_Core.primitive.Student;

public class App {

	public static void main(String args[])
	{
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/prog/Spring_Core/collection/config.xml");
		
		Student st=context.getBean("st1",Student.class);
		System.out.println(st);
	}
}
