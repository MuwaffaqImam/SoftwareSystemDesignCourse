package com.muwaffaq.innopolis.tutorial12_Observer_Facade_Proxy.Proxy.Solution;

import com.muwaffaq.innopolis.tutorial12_Observer_Facade_Proxy.Proxy.Image;

public class ProxyImage implements Image {

    private RealImage realImage;
    private String imageName;

    public ProxyImage(String imageName) {

        this.imageName = imageName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(imageName);
            realImage.loadFromDisk(imageName);
        } else
            realImage.display();
    }
}
