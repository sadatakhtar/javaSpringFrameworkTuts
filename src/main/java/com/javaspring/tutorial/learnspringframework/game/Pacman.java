package com.javaspring.tutorial.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class Pacman implements GameConsole{
    @Override
    public void up() {
        System.out.println("Pacman munching up");
    }

    @Override
    public void down() {
        System.out.println("Pacman munching down");
    }

    @Override
    public void left() {
        System.out.println("Pacman munching left");
    }

    @Override
    public void right() {
        System.out.println("Pacman munching right");
    }
}
