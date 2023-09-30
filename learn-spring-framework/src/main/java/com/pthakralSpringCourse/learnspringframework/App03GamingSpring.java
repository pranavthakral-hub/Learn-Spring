package com.pthakralSpringCourse.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pthakralSpringCourse.learnspringframework.game.GameRunner;
import com.pthakralSpringCourse.learnspringframework.game.GamingConsole;

public class App03GamingSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);) {
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}

	}

}
