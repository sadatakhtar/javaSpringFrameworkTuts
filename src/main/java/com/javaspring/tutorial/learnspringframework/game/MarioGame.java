package com.javaspring.tutorial.learnspringframework.game;

import org.springframework.stereotype.Component;

//@Component
public class MarioGame implements GameConsole{
    public void up(){
        System.out.println("Mario jump");
    }
    public void down(){
        System.out.println("Mario duck");
    }
    public void left(){
        System.out.println("Mario stop");
    }
    public void right(){
        System.out.println("Mario accelerate");
    }

}
