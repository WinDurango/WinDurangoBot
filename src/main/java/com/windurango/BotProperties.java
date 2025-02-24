package com.windurango;

public class BotProperties {
    private static String BOT_NAME;
    private static String BOT_VERSION;
    private static String BOT_AUTHOR;

    private static String BOT_TOKEN;
    private static String BOT_SECRET;

    private static String BOT_PREFIX;

    private static String[] BOT_INTENTS;
    private static String[] BOT_LOADABLE_MODULES;
    private static String[] BOT_MESSAGE_LISTENERS;

    private BotProperties() {

    }

    public BotProperties getInstance() {
        return new BotProperties();
    }

    public static String getBotName() {
        return BOT_NAME;
    }

    public static void setBotName(String botName) {
        BOT_NAME = botName;
    }

    public static String getBotVersion() {
        return BOT_VERSION;
    }

    public static void setBotVersion(String botVersion) {
        BOT_VERSION = botVersion;
    }

    public static String getBotAuthor() {
        return BOT_AUTHOR;
    }

    public static void setBotAuthor(String botAuthor) {
        BOT_AUTHOR = botAuthor;
    }

    public static String getBotToken() {
        return BOT_TOKEN;
    }

    public static void setBotToken(String botToken) {
        BOT_TOKEN = botToken;
    }

    public static String getBotSecret() {
        return BOT_SECRET;
    }

    public static void setBotSecret(String botSecret) {
        BOT_SECRET = botSecret;
    }

    public static String getBotPrefix() {
        return BOT_PREFIX;
    }

    public static void setBotPrefix(String botPrefix) {
        BOT_PREFIX = botPrefix;
    }

    public static String[] getBotIntents() {
        return BOT_INTENTS;
    }

    public static void setBotIntents(String[] botIntents) {
        BOT_INTENTS = botIntents;
    }

    public static String[] getBotLoadableModules() {
        return BOT_LOADABLE_MODULES;
    }

    public static void setBotLoadableModules(String[] botLoadableModules) {
        BOT_LOADABLE_MODULES = botLoadableModules;
    }

    public static String[] getBotMessageListeners() {
        return BOT_MESSAGE_LISTENERS;
    }

    public static void setBotMessageListeners(String[] botMessageListeners) {
        BOT_MESSAGE_LISTENERS = botMessageListeners;
    }

    // TODO: Load properties from a configuration file.
    public static void loadProperties() {
        
    }
}
