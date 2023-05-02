package com.muwaffaq.innopolis.tutorial12_Observer_Facade_Proxy.Observer.subscriber;
import com.muwaffaq.innopolis.tutorial12_Observer_Facade_Proxy.Observer.Game;
import com.muwaffaq.innopolis.tutorial12_Observer_Facade_Proxy.Observer.Observer;

public class DarkSoulsFan implements Observer<Game> {
    @Override
    public void update(Game data) {
        if (data.title.toLowerCase().contains("dark souls")) {
            System.out.println("I'm a Dark souls fan");
            System.out.println("Dark Soul is Here go to store NOW $$$$$g");
            System.out.println("------------");
        }
    }
}