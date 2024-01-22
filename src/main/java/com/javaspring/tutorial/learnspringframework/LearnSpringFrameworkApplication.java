package com.javaspring.tutorial.learnspringframework;

import com.javaspring.tutorial.learnspringframework.game.GameRunner;
import com.javaspring.tutorial.learnspringframework.game.MarioGame;
import com.javaspring.tutorial.learnspringframework.game.Pacman;
import com.javaspring.tutorial.learnspringframework.game.SuperContra;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);

		//Pacman game = new Pacman();
		//MarioGame game = new MarioGame();
		//SuperContra game = new SuperContra();
		//GameRunner runner = new GameRunner(game);
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
	}

}
