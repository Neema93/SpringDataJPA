package com.demo.demo.game;

public class MarioGame implements GameConsole {
    public void up(){
        System.out.println("jump");
    }
    public void down(){
        System.out.println("down into hole");
    }
    public void left(){
        System.out.println("stop");
    }
    public void right(){
        System.out.println("go");
    }
}
