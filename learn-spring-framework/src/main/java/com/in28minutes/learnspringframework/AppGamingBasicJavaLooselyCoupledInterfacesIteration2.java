package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunnerLooselyCoupleInterfaces;
import com.in28minutes.learnspringframework.game.GameRunnerTightCoupled;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PacManGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;

public class AppGamingBasicJavaLooselyCoupledInterfacesIteration2 {

	public static void main(String[] args) {

		//var game = new MarioGame(); 	
		//var game= new SuperContraGame(); // here we can basically switch between MarioGame and SuperContra seamlessly because both implements the GamingConsole interface,  
		var game =  new PacManGame();
		var gameRunner = new GameRunnerLooselyCoupleInterfaces(game); //here we are wiring the dependency
		// game is the dependency, it can be view as an external library that the main program(the dependent) needs , the dependency provides certain functionalities or services 
		//that the main program needs
		gameRunner.run();
	}

}
