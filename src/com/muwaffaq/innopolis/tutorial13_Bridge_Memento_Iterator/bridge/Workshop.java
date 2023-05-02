package com.muwaffaq.innopolis.tutorial13_Bridge_Memento_Iterator.bridge;


abstract class Workshop {

    Operation operation;

    public void setWorkshop(Operation operation) {
        this.operation = operation;
    }

    public void startFiltering(String message) {
        operation.operate(message);
    }
}
