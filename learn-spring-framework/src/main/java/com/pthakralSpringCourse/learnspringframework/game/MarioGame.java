package com.pthakralSpringCourse.learnspringframework.game;

public class MarioGame implements GamingConsole {
	
	public void up() {
		System.out.println("Jumping");
	}
	
	public void down() {
		System.out.println("Go in a hole");
	}
	
	public void left() {
		System.out.println("Go back");
	}
	
	public void right() {
		System.out.println("Accelarate");
	}
}
