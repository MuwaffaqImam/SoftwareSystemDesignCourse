package com.muwaffaq.innopolis.tutorial12_Observer_Facade_Proxy.Proxy.Solution;

public class Main {


    public static void main(String[] args) {
        ProxyImage image1 = new ProxyImage("cat");
        image1.display();
        image1.display();
        image1.display();
        ProxyImage image2 = new ProxyImage("dog");
        image2.display();
        image2.display();
        image2.display();
    }
}
