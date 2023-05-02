package com.muwaffaq.innopolis.tutorial15_chain_command_template.Chain.Problem;

import com.muwaffaq.innopolis.tutorial15_chain_command_template.Chain.Solution.Request;

public class HandleComplexRequest extends Handler {

    public HandleComplexRequest(Handler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        System.out.println("I'm in Complex class");
        if (request.getType() == Request.RequestType.COMPLEX)
            System.out.println("Handle the Complex Request");
        else super.handleRequest(request);
    }
}
