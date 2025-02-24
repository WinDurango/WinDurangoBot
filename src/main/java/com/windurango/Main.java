package com.windurango;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;

import java.util.Collection;
import java.util.EnumSet;

public class Main {
    private static final Collection<GatewayIntent> intents = EnumSet.of(GatewayIntent.GUILD_MESSAGES, GatewayIntent.GUILD_MESSAGE_REACTIONS);

    // TODO: Load these properties from a configuration file
    public static final String PREFIX = "!";
    public static final String BOT_NAME = "Windurango";
    public static final String BOT_TOKEN = "";
    public static final String BOT_VERSION = "0.0.1";
    public static final String BOT_AUTHOR = "Windurango Team";
    public static final String

    public static void main(String[] args) {
        JDABuilder
                .create(BOT_TOKEN, intents)
                .addEventListeners(new MessageListener())
                .build();
    }
}