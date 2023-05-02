package com.muwaffaq.innopolis.tutorial12_Observer_Facade_Proxy.Observer.subscriber;


import com.muwaffaq.innopolis.tutorial12_Observer_Facade_Proxy.Observer.Game;
import com.muwaffaq.innopolis.tutorial12_Observer_Facade_Proxy.Observer.Observer;

public class PlaystationFan implements Observer<Game> {
    @Override
    public void update(Game data) {
        System.out.println("I'm a playstation fan");
        System.out.println("a New Game Arrived\n");
        System.out.println(data.toString());
        System.out.println("------------");
    }
}
