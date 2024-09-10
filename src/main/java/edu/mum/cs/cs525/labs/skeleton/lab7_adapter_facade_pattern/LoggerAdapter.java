package edu.mum.cs.cs525.labs.skeleton.lab7_adapter_facade_pattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class LoggerAdapter implements LoggerClient {

    private static final Logger log4jLogger = (Logger) LogManager.getLogger(LoggerAdapter.class);

    @Override
    public void log(LogLevel logLevel, String message) {
        switch (logLevel) {
            case DEBUG:
                log4jLogger.debug(message);
                break;
            case ERROR:
                log4jLogger.error(message);
                break;
            case FATAL:
                log4jLogger.fatal(message);
                break;
            case INFO:
                log4jLogger.info(message);
                break;
            case TRACE:
                log4jLogger.trace(message);
                break;
            case WARNING:
                log4jLogger.warn(message);
                break;
            default:
                break;
        }
    }
}
