package com.muwaffaq.innopolis.observer.publisher;

import com.muwaffaq.innopolis.observer.Game;
import com.muwaffaq.innopolis.observer.Observer;

import java.util.ArrayList;
import java.util.List;

// Publisher or Subject
public class Playstaion {

    List<Observer<Game>> mObservers;

    public Playstaion() {
        this.mObservers = new ArrayList<>();
    }

    public void subscribe(Observer<Game> observer) {
        mObservers.add(observer);
    }


    public void notify(Game game) {
        mObservers.forEach(observer -> observer.update(game));
    }


}
