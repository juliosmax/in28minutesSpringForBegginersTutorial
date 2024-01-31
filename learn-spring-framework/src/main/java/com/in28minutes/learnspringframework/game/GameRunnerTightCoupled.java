package com.in28minutes.learnspringframework.game;
// this is iteration 1 , tightly coupled
public class GameRunnerTightCoupled {

	//private MarioGame game;  // 1st as a tightly coupled we had this instance class
	private SuperContraGame game;
	
/*	public GameRunner(MarioGame game) {  // 1st what we had initially
		this.game = game;
	} */
	
	public GameRunnerTightCoupled(SuperContraGame game) {  // 2nd we needed to accept a superContraGame and thats why we changed the constructor
		this.game = game;                      // this is because is hardly coupled
	}

	public void run() {
	System.out.println("Running Game: "+ game );
	game.up();
	game.down();
	game.left();
	game.right();
	}
}
