package com.muwaffaq.innopolis.tutorial12_Observer_Facade_Proxy.Observer;
import com.muwaffaq.innopolis.tutorial12_Observer_Facade_Proxy.Observer.publisher.PlaystationManager;
import com.muwaffaq.innopolis.tutorial12_Observer_Facade_Proxy.Observer.subscriber.DarkSoulsFan;
import com.muwaffaq.innopolis.tutorial12_Observer_Facade_Proxy.Observer.subscriber.HorizonFan;
import com.muwaffaq.innopolis.tutorial12_Observer_Facade_Proxy.Observer.subscriber.PlaystationFan;

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
