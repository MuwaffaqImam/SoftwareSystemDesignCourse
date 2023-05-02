package com.muwaffaq.innopolis.tutorial14_Visitor_Mediator_Flyweight.Mediator.Solution;

public class User {
   private String name;
   private ChatMediator mediator;

    public User(String name, ChatMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void sendMessage(String content) {
        mediator.sendMessage(new Message(this, content));
    }

    void receiveMessage(Message message) {
        System.out.println(name+ " Received this message:");
        System.out.println(message.sender.name + ": "+ message.content);
    }
}
