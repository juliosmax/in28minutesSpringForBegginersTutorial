package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.learnspringframework.game.GameRunnerLooselyCoupleInterfaces;
import com.in28minutes.learnspringframework.game.GamingConsole;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PacManGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;

@Configuration
public class GamesConfiguration {

	@Bean
	public MarioGame marioGame() {
		return new MarioGame();
	}
	
	@Bean
	public PacManGame pacManGame() {
		return new PacManGame();
	}
	
	@Bean
	public SuperContraGame superContraGame() {
		return new SuperContraGame();
	}
	
	@Bean
	public GamingConsole gamingConsole() {
		return new SuperContraGame();
	}
	
	@Bean
	public GameRunnerLooselyCoupleInterfaces gameRunnerLooselyCoupleInterfaces(GamingConsole gamingConsole) {
		return new GameRunnerLooselyCoupleInterfaces(gamingConsole);
	}
}
