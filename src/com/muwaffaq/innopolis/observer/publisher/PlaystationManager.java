package com.muwaffaq.innopolis.observer.publisher;


import com.muwaffaq.innopolis.observer.Game;
import com.muwaffaq.innopolis.observer.Observer;

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
        playstaion.notify(game);

    }

    public void subscribeToPlaystaion(Observer<Game> fan) {
        playstaion.subscribe(fan);
    }
}
