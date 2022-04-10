package com.muwaffaq.innopolis.lab13.observer.subscriber;
import com.muwaffaq.innopolis.lab13.observer.Game;
import com.muwaffaq.innopolis.lab13.observer.Observer;

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