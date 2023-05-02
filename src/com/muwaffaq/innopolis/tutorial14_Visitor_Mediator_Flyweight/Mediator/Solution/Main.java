package com.muwaffaq.innopolis.tutorial14_Visitor_Mediator_Flyweight.Mediator.Solution;

public class Main {


    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImplementation();
        User vlad = new User("Vlad",mediator);
        User ali = new User("Ali",mediator);
        User lara = new User("Lara",mediator);

        mediator.addUser(vlad);
        mediator.addUser(ali);
        mediator.addUser(lara);

        vlad.sendMessage("Hello every one");
        lara.sendMessage("Hi Vladi?");
        vlad.sendMessage("It's Vlad, please learn to read");
        lara.sendMessage("and it's everyone NOT every one!!!");
        ali.sendMessage("clam down everyone!");
    }
}
