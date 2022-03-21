package com.muwaffaq.innopolis.designPattern.observer.publisher;


import com.muwaffaq.innopolis.designPattern.observer.Game;
import com.muwaffaq.innopolis.designPattern.observer.Observer;

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
