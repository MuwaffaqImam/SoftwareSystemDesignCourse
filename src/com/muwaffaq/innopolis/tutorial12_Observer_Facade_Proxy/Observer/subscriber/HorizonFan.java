package com.muwaffaq.innopolis.tutorial12_Observer_Facade_Proxy.Observer.subscriber;


import com.muwaffaq.innopolis.tutorial12_Observer_Facade_Proxy.Observer.Game;
import com.muwaffaq.innopolis.tutorial12_Observer_Facade_Proxy.Observer.Observer;

public class HorizonFan implements Observer<Game> {
    @Override
    public void update(Game data) {
        if (data.title.toLowerCase().contains("horizon")) {
            System.out.println("I'm Horizon fan");
            System.out.println("Yes,lets Go Aloy!! ... ");
            System.out.println("------------");
        }
    }
}
