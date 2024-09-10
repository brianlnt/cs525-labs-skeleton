package edu.mum.cs.cs525.labs.skeleton.lab7_adapter_facade_pattern;

import org.apache.logging.log4j.core.Logger;

public class LoggerTestDrive {

    private static final LoggerClient myLogger = new LoggerAdapter(LoggerTestDrive.class);

    public static void main(String[] args) {
        myLogger.log(LogLevel.INFO, "Application started");
        myLogger.log(LogLevel.ERROR, "An error occurred");
    }
}
