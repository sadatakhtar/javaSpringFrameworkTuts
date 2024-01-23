package com.javaspring.tutorial.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SuperContra implements GameConsole{
    public void up(){
        System.out.println("SuperContra up");
    }
    public void down(){
        System.out.println("superContra down");
    }
    public void left(){
        System.out.println("superContra left");
    }
    public void right(){
        System.out.println("superContra right");
    }
}
