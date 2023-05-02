package com.muwaffaq.innopolis.tutorial15_chain_command_template.Chain;

import com.muwaffaq.innopolis.tutorial15_chain_command_template.Chain.Solution.*;

public class Main {

    public static void main(String[] args) {
        Handler handlerC = new HandleRequestC(null);
        Handler handlerB = new HandleRequestB(handlerC);
        Handler handlerA = new HandleRequestA(handlerB);

        Request requestA = new Request(Request.RequestType.SIMPLE);
        Request requestB = new Request(Request.RequestType.MED);
        Request requestC = new Request(Request.RequestType.COMPLEX);

        handlerA.handleRequest(requestA);
        handlerA.handleRequest(requestB);
        handlerA.handleRequest(requestC);

        handlerA.handleRequest(requestB);
        handlerA.handleRequest(requestB);
        handlerA.handleRequest(requestA);
        handlerA.handleRequest(requestC);
    }
}
