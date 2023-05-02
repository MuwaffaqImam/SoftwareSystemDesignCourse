package com.muwaffaq.innopolis.tutorial15_chain_command_template.Chain.Problem;

import com.muwaffaq.innopolis.tutorial15_chain_command_template.Chain.Solution.Request;

public class Main {


    public static void main(String[] args) {
        Handler complex = new HandleComplexRequest(null);
        Handler med = new HandleMedRequest(complex);
        Handler simple = new HandleSimpleRequest(med);
        complex.handleRequest(new Request(Request.RequestType.SIMPLE));

    }




}
