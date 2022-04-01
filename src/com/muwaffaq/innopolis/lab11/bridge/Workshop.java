package com.muwaffaq.innopolis.lab11.bridge;


abstract class Workshop {

    Operation operation;

    public void setWorkshop(Operation operation) {
        this.operation = operation;
    }

    public void startFiltering(String message) {
        operation.operate(message);
    }
}
