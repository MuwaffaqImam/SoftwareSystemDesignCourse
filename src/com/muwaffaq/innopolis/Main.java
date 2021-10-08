package com.muwaffaq.innopolis;

import com.muwaffaq.innopolis.labwork.Father;
import com.muwaffaq.innopolis.labwork.Son;

public class Main {

    /**
     * This is the Main branch it does Nothing
     * Every lab has it's own branch, so please check branches ..
     * @param args
     */

    public static void main(String[] args) {
        Son son = new Son("Vlad", "ivanov");
        Father father = new Father("max","ivanov",son);
        father.giveAllowances(100);
        father.payBills(200);
        son.buyBooks(90);
        son.report();
        father.report();

    }
}
