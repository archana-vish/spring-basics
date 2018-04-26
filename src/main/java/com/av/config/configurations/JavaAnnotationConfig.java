package com.av.config.configurations;

import com.av.config.entities.BaseballGame;
import com.av.config.entities.Game;
import com.av.config.entities.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.av.config.entities")
public class JavaAnnotationConfig {

    @Autowired
    @Qualifier("sox")
    private Team home;

    @Autowired
    @Qualifier("cubs")
    private Team away;

    @Bean
    public Game game() {
        return new BaseballGame(home,away);
    }
}
