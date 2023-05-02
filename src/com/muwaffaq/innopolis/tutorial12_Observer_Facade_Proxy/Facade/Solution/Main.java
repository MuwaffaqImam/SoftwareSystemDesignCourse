package com.muwaffaq.innopolis.tutorial12_Observer_Facade_Proxy.Facade.Solution;

import java.sql.SQLException;

public class Main {


    public static void main(String[] args) {
        ApiFacade facade = new ApiFacade();
        System.out.println(facade.getResponse( "https://jsonplaceholder.typicode.com/todos"));
        System.out.println(facade.getResponse( "https://jsonplaceholder.typicode.com/todos/1"));

        try {
            DatabaseFacade facade1 = new DatabaseFacade();
            facade1.executeUpdate("insert ... ");
            facade1.executeUpdate("insert ... ");
            facade1.beginTransaction();
            facade1.rollbackTransaction();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
