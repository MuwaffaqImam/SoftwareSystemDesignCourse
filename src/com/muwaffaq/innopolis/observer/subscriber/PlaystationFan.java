package com.muwaffaq.innopolis.observer.subscriber;


import com.muwaffaq.innopolis.observer.Game;
import com.muwaffaq.innopolis.observer.Observer;

public class PlaystationFan implements Observer<Game> {
    @Override
    public void update(Game data) {
        System.out.println("I'm a playstation fan");
        System.out.println("a New Game Arrived\n");
        System.out.println(data.toString());
        System.out.println("------------");
    }
}
