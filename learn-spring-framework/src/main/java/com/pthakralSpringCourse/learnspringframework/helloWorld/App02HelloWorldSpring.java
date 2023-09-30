package com.pthakralSpringCourse.learnspringframework.helloWorld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pthakralSpringCourse.learnspringframework.helloWorld.HelloWorldConfiguration.Person;

public class App02HelloWorldSpring {
	
	public static void main(String[] args) {
		
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		context.getBean("name");
		System.out.println(context.getBean("name"));
		
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person1"));
		System.out.println(context.getBean("person2MethodCall"));
		System.out.println(context.getBean("address2"));
		System.out.println(context.getBean("person3Parameters"));
		System.out.println(context.getBean(Person.class));
		
	}
}
