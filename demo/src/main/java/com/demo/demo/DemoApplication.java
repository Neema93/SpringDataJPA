package com.demo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.demo.game.GameRunner;
import com.demo.demo.game.MarioGame;
//import com.demo.demo.game.SuperContraGame;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		MarioGame game = new MarioGame();
		//SuperContraGame game = new SuperContraGame();
		GameRunner runner = new GameRunner(game);
		runner.run();

	}

}
