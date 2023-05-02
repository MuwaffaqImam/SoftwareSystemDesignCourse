package com.muwaffaq.innopolis.tutorial15_chain_command_template.Chain.Solution;

public class HandleRequestB extends Handler {
    public HandleRequestB(Handler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getType() == Request.RequestType.MED)
            System.out.println("Handeling Request B");
        else
            super.handleRequest(request);
    }
}
