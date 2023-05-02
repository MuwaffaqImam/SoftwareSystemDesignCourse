package com.muwaffaq.innopolis.tutorial12_Observer_Facade_Proxy.Observer.publisher;


import com.muwaffaq.innopolis.tutorial12_Observer_Facade_Proxy.Observer.Game;
import com.muwaffaq.innopolis.tutorial12_Observer_Facade_Proxy.Observer.Observer;

import java.util.Scanner;

public class PlaystationManager {

    private final Scanner scanner;
    private Playstaion playstaion;

    public PlaystationManager() {
        // dependency injection
        this.playstaion = new Playstaion();
        scanner = new Scanner(System.in);
    }
    public void addGame() {
        System.out.println("Enter game Title");
        String title = scanner.nextLine();
        System.out.println("Enter Company");
        String company = scanner.nextLine();
        Game game = new Game();
        game.title = title;
        game.company = company;
        playstaion.update(game);

    }

    public void subscribeToPlaystaion(Observer<Game> fan) {
        playstaion.subscribe(fan);
    }
}
