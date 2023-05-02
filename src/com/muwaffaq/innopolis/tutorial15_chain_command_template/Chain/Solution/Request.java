package com.muwaffaq.innopolis.tutorial15_chain_command_template.Chain.Solution;

public class Request {
    private RequestType type;

    public Request(RequestType type) {
        this.type = type;
    }

    public RequestType getType() {
        return type;
    }
    public enum RequestType {
        SIMPLE,
        MED,
        COMPLEX
    }
}



