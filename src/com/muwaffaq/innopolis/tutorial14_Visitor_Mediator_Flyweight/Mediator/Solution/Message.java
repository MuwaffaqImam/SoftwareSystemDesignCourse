package com.muwaffaq.innopolis.tutorial14_Visitor_Mediator_Flyweight.Mediator.Solution;

public class Message {
    User sender;
    String content;

    public Message(User sender, String content) {
        this.sender = sender;
        this.content = content;
    }

    public User getSender() {
        return sender;
    }

    public String getContent() {
        return content;
    }
}
