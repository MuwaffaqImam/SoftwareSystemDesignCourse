package com.muwaffaq.innopolis.tutorial12_Observer_Facade_Proxy.Facade.Problem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * Let's say you want to develop an application that requires constant communication with an API to retrieve responses.
 * In such a scenario, it is crucial to create a logic that optimizes the following code:
 */
public class Api {


    public static void main(String[] args) throws MalformedURLException {
        getTodos();
        getTodosId("4");
    }

    private static void getTodos() {
        try {
            URL url = new URL("https://jsonplaceholder.typicode.com/todos");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept","application/json");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String lines;
            StringBuffer response = new StringBuffer();
            while ((lines = reader.readLine()) != null){
                response.append(lines);
            }
            response.toString();
            System.out.println(response);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    private static void getTodosId(String id) {
        try {
            URL url = new URL("https://jsonplaceholder.typicode.com/todos/"+id);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept","application/json");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String lines;
            StringBuffer response = new StringBuffer();
            while ((lines = reader.readLine()) != null){
                response.append(lines);
            }
            response.toString();
            System.out.println(response);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
