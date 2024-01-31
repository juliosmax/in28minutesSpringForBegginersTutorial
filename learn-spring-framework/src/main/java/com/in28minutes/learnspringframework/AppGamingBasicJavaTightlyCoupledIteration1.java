package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunnerTightCoupled;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;

public class AppGamingBasicJavaTightlyCoupledIteration1 {

	public static void main(String[] args) {

		//var marioGame = new MarioGame(); // 1st we try with MarioGame a send the var to the GameRunner constructor , but this is the tightly coupled way
		var superContraGame = new SuperContraGame(); // 2nd we created a superContraGame but we coulndt just send it to the constructor because it just accept a MarioGame argument
		var gameRunner = new GameRunnerTightCoupled(superContraGame);
		gameRunner.run();
	}

}
