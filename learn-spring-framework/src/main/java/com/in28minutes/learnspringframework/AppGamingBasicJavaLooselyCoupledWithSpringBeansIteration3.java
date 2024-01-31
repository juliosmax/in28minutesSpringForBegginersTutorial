package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.learnspringframework.game.GameRunnerLooselyCoupleInterfaces;
import com.in28minutes.learnspringframework.game.GameRunnerTightCoupled;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PacManGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;
import com.in28minutes.learnspringframework.hello.HelloWorldConfiguration;

public class AppGamingBasicJavaLooselyCoupledWithSpringBeansIteration3 {

	public static void main(String[] args) {

		try(var context = new AnnotationConfigApplicationContext(GamesConfiguration.class)) { // this is called try with a resources , its will close the resources
            // in this case the context at the end or in case of an exception
		//var game =  new PacManGame();
		//var game= (MarioGame) context.getBean("marioGame");		
		//var gameRunner = new GameRunnerLooselyCoupleInterfaces(game); //here we are wiring the dependency

		context.getBean(GameRunnerLooselyCoupleInterfaces.class).run();
		}
	}

}
