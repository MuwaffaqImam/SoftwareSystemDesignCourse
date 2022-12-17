package com.muwaffaq.innopolis.lab10.singleton.Reader;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MainTransition {

    public static void main(String[] args) {
        System.out.print("Program started at " );
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(dtf.format(LocalDateTime.now()));
        Writer1 writer1 = new Writer1();
        writer1.write();
        Writer2 writer2 = new Writer2();
        writer2.write();
        System.out.print("Program finished at ");
        System.out.println(dtf.format(LocalDateTime.now()));



    }
}
