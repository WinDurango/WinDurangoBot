package com.windurango.logging;

public class LogMessage {
    private String message;
    private LogLevel logLevel;
    private String timestamp;
    private Class<?> source;

    public LogMessage() {

    }

    public LogMessage(String message, LogLevel logLevel, String timestamp, Class<?> source) {
        this.message = message;
        this.logLevel = logLevel;
        this.timestamp = timestamp;
        this.source = source;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LogLevel getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Class<?> getSource() {
        return source;
    }

    public void setSource(Class<?> source) {
        this.source = source;
    }
}
