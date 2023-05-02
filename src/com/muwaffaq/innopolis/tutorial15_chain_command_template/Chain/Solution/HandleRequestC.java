package com.muwaffaq.innopolis.tutorial15_chain_command_template.Chain.Solution;

public class HandleRequestC extends Handler {
    public HandleRequestC(Handler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getType() == Request.RequestType.COMPLEX)
            System.out.println("Handeling Request C");
        else
            super.handleRequest(request);
    }
}
