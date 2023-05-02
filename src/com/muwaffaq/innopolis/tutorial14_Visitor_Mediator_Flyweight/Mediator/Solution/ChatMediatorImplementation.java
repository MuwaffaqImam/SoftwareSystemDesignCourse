package com.muwaffaq.innopolis.tutorial14_Visitor_Mediator_Flyweight.Mediator.Solution;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImplementation implements ChatMediator {

    private List<User> userList = new ArrayList<>();

    @Override
    public void sendMessage(Message message) {
        for (User user : userList) {
            if (user != message.sender)
                user.receiveMessage(message);
        }
    }

    @Override
    public void addUser(User user) {
        userList.add(user);
    }
}
