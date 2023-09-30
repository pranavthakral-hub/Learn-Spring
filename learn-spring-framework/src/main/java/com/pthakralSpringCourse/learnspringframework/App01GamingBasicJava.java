package com.pthakralSpringCourse.learnspringframework;

import com.pthakralSpringCourse.learnspringframework.game.GameRunner;
import com.pthakralSpringCourse.learnspringframework.game.MarioGame;
import com.pthakralSpringCourse.learnspringframework.game.PacmanGame;
import com.pthakralSpringCourse.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		
//		var marioGame = new MarioGame();
		var superContraGame = new SuperContraGame();
		var pacmanGame = new PacmanGame();
		var gameRunner = new GameRunner(superContraGame);
		
		gameRunner.run();

	}

}
