package com.av.config.entities;

import org.springframework.stereotype.Component;

@Component
public class Sox implements Team{
    @Override
    public String getName() {
        return "Sox";
    }
}
