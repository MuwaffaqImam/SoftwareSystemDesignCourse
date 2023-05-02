package com.muwaffaq.innopolis.tutorial15_chain_command_template.Chain.Problem;

import com.muwaffaq.innopolis.tutorial15_chain_command_template.Chain.Solution.Request;

public class HandleMedRequest extends Handler {

    public HandleMedRequest(Handler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        System.out.println("I'm in Med class");
        if (request.getType() == Request.RequestType.MED)
            System.out.println("Handle the Med Request");
        else super.handleRequest(request);
    }
}
