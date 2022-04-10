package com.muwaffaq.innopolis.lab13.observer;
import com.muwaffaq.innopolis.lab13.observer.publisher.PlaystationManager;
import com.muwaffaq.innopolis.lab13.observer.subscriber.DarkSoulsFan;
import com.muwaffaq.innopolis.lab13.observer.subscriber.HorizonFan;
import com.muwaffaq.innopolis.lab13.observer.subscriber.PlaystationFan;

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
