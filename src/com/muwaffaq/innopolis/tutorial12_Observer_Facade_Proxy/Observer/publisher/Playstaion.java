package com.muwaffaq.innopolis.tutorial12_Observer_Facade_Proxy.Observer.publisher;

import com.muwaffaq.innopolis.tutorial12_Observer_Facade_Proxy.Observer.Game;
import com.muwaffaq.innopolis.tutorial12_Observer_Facade_Proxy.Observer.Observer;

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

    public void update(Game game) {
        mObservers.forEach(observer -> observer.update(game));
    }


}
