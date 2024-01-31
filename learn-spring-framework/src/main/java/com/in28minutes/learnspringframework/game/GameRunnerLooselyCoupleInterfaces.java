package com.in28minutes.learnspringframework.game;
// iteration 2 , loosely coupling using interfaces
public class GameRunnerLooselyCoupleInterfaces {
		private GamingConsole game;
		
		public GameRunnerLooselyCoupleInterfaces(GamingConsole game) {  // in this level we dont receive an implementation rather an interface
			this.game = game;                      
		}

		public void run() {
		System.out.println("Running Game: "+ game );
		game.up();
		game.down();
		game.left();
		game.right();
		}
}
