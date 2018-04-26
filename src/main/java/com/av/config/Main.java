package com.av.config;

import com.av.config.configurations.JavaAnnotationConfig;
import com.av.config.entities.Game;
import com.av.config.entities.Team;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(JavaAnnotationConfig.class);


        Game baseball = applicationContext.getBean("game", Game.class);
        baseball.playGame();
    }
}
