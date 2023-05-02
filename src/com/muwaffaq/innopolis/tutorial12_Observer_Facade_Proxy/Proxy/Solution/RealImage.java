package com.muwaffaq.innopolis.tutorial12_Observer_Facade_Proxy.Proxy.Solution;

import com.muwaffaq.innopolis.tutorial12_Observer_Facade_Proxy.Proxy.Image;

public class RealImage implements Image {

    private String path;
    private String imageName;
    private boolean isLoaded=false;

    public RealImage(String imageName) {
        this.imageName = imageName;
        // load expensive object
        loadFromDisk(imageName);
    }


    @Override
    public void display() {
        if(!isLoaded)
            throw new IllegalArgumentException("Please load the image from disk first");
        System.out.println("Displaying Image "+ imageName);
    }

    public void loadFromDisk(String imageName){
        System.out.println("long Process loading Image from Disk Path "+imageName);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        isLoaded = true;
    }

}
