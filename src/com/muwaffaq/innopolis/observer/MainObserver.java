package com.muwaffaq.innopolis.observer;
import com.muwaffaq.innopolis.observer.subscriber.*;
import com.muwaffaq.innopolis.observer.publisher.PlaystationManager;

public class MainObserver {


    // TODO Implement Homework
    public static void main(String[] args) {
	// welcome to class
        System.out.println("Welcome to class");
        PlaystationManager manager = new PlaystationManager();
        DarkSoulsFan fan1= new DarkSoulsFan();
        HorizonFan fan2= new HorizonFan();
        PlaystationFan fan3= new PlaystationFan();
        manager.subscribeToPlaystaion(fan1);
        manager.subscribeToPlaystaion(fan2);
        manager.subscribeToPlaystaion(fan3);
        manager.addGame();
    }
}
