package com.muwaffaq.innopolis.designPattern.observer.subscriber;


import com.muwaffaq.innopolis.designPattern.observer.Game;
import com.muwaffaq.innopolis.designPattern.observer.Observer;

public class PlaystationFan implements Observer<Game> {
    @Override
    public void update(Game data) {
        System.out.println("I'm a playstation fan");
        System.out.println("a New Game Arrived\n");
        System.out.println(data.toString());
        System.out.println("------------");
    }
}
