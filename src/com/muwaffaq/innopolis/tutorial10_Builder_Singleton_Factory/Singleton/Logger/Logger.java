package com.muwaffaq.innopolis.tutorial10_Builder_Singleton_Factory.Singleton.Logger;

import java.util.Date;

/**
 * Homework:
 * TODO:Implement a Logger class that uses both the Singleton and Builder patterns. The Logger class should have the following features:
 * TODO:Only one instance of the Logger class should exist in the application at any given time.
 * TODO:The Logger class should allow for customization through builder of the log format and output destination.
 * TODO: Output destination is an enum {FILE, CONSOLE}
 * TODO:The Logger class should be easy to use, with a simple API for logging messages.
 * TODO:The Logger class should support different log levels, such as INFO, WARNING, and ERROR.
 */
public class Logger {
    private static Logger instance;
    private String logFormat;
    private Destination outputDestination;

    enum Destination {FILE, CONSOLE}

    private Logger() {
        // Private constructor to prevent instantiation from outside
        this.logFormat = "%s - %s - %s";
        this.outputDestination = Destination.CONSOLE;
    }

    // Singleton pattern implementation
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Builder pattern implementation
    public static class LoggerBuilder {
        private Logger logger;

        public LoggerBuilder() {
            this.logger = new Logger();
        }

        public LoggerBuilder setLogFormat(String logFormat) {
            this.logger.logFormat = logFormat;
            return this;
        }

        public LoggerBuilder setOutputDestination(Destination outputDestination) {
            this.logger.outputDestination = outputDestination;
            return this;
        }

        public Logger build() {
            return this.logger;
        }
    }

    // Logging methods
    public void info(String message) {
        log("INFO", message);
    }

    public void warning(String message) {
        log("WARNING", message);
    }

    public void error(String message) {
        log("ERROR", message);
    }

    private void log(String level, String message) {
        String formattedMessage = String.format(logFormat, level, new Date(), message);
        if (instance.outputDestination == Destination.CONSOLE)
            System.out.println(formattedMessage);
        else{
            // write to file
        }
    }

}
