package com.muwaffaq.innopolis.tutorial15_chain_command_template.Chain.Problem;

import com.muwaffaq.innopolis.tutorial15_chain_command_template.Chain.Solution.Request;

public class HandleSimpleRequest extends Handler {

    public HandleSimpleRequest(Handler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        System.out.println("I'm in Simple class");
        if (request.getType() == Request.RequestType.SIMPLE)
            System.out.println("Handle the Simple Request");
        else super.handleRequest(request);
    }
}
