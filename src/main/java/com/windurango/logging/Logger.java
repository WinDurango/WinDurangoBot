package com.windurango.logging;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple generics based singleton logger class.
 */
public class Logger<T> {
    private static Logger<?> instance;

    private static LogLevel logLevel;

    List<LogMessage> logs = new ArrayList<>();

    private Logger() {
        logLevel = LogLevel.INFO;
    }

    @SuppressWarnings({"unchecked"})
    public static synchronized <T> Logger<T> getInstance() {
        if (instance == null) instance = new Logger<>();

        return (Logger<T>) instance;
    }

    public void logInfo(String message) {
        LogMessage logMessage = new LogMessage();

        logMessage.setLogLevel(logLevel);
        logMessage.setMessage(message);
        logMessage.setTimestamp(String.valueOf(System.currentTimeMillis()));

        // TODO: Get the class of this Logger object based on generics.

        logs.add(logMessage);
    }

    public void logWarning() {

    }

    public void logError() {

    }

    public void logCritical() {

    }

    public void logDebug() {

    }

    public static LogLevel getLogLevel() {
        return logLevel;
    }

    public static void setLogLevel(LogLevel logLevel) {
        Logger.logLevel = logLevel;
    }
}