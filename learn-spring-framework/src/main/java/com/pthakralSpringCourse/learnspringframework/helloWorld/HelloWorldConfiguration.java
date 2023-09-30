package com.pthakralSpringCourse.learnspringframework.helloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class HelloWorldConfiguration {

	record Person (String name, int age, Address address) {};
	
	record Address (String firstLine, String city) {};
	
	@Bean
	public String name() {
		return "Pranav";
	}
	
	@Bean
	public int age() {
		return 22;
	}
	
	@Bean
	public Person person1() {
		var person = new Person("Ishita", 21, new Address("GoldCroft", "New Delhi"));
		return person;
	}
	
	@Bean
	@Primary
	public Person person2MethodCall() {
		return new Person(name(), age(), address());
	}
	
	@Bean
	public Person person3Parameters(String name, int age,@Qualifier("address2Qualifier") Address addresss) {
		return new Person(name, age, addresss);
	}
	
	@Bean(name = "address2")
	@Qualifier("address2Qualifier")
	public Address address() {
		var address = new Address("A-3/79", "New Delhi");
		return address;
	}
	
	
	
}
