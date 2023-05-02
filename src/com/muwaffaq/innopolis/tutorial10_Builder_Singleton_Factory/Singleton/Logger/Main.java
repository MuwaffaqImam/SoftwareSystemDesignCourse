package com.muwaffaq.innopolis.tutorial10_Builder_Singleton_Factory.Singleton.Logger;

public class Main {

    public static void main(String[] args) {
        Logger logger = new Logger.LoggerBuilder()
                .setLogFormat("%s [%s]: %s")
                .setOutputDestination(Logger.Destination.CONSOLE)
                .build();

        logger.info("This is an info message.");
        logger.warning("This is a warning message.");
        logger.error("This is an error message.");

    }
}
