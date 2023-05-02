package com.muwaffaq.innopolis.tutorial15_chain_command_template.Chain.Problem;

import com.muwaffaq.innopolis.tutorial15_chain_command_template.Chain.Solution.Request;

abstract public class Handler {
    Handler next;
    public Handler(Handler next) {
        this.next = next;
    }
    public void handleRequest(Request request) {
        if (next != null)
            next.handleRequest(request);
    }
}
