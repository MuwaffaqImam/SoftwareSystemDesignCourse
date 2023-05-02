package com.muwaffaq.innopolis.tutorial15_chain_command_template.Chain.Solution;

public class HandleRequestA extends Handler {
    public HandleRequestA(Handler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getType() == Request.RequestType.SIMPLE)
            System.out.println("Handeling Request A");
        else
            super.handleRequest(request);
    }
}
