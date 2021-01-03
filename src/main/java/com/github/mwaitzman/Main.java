package com.github.mwaitzman;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import io.github.cdimascio.dotenv.Dotenv;
public class Main {

    public static void main(String[] args) {
        // Insert your bot's token here
        Dotenv dotenv = Dotenv.load();
        final String Discord_Bot_Token = dotenv.get("DISCORD_BOT_TOKEN");


        DiscordApi api = new DiscordApiBuilder().setToken(Discord_Bot_Token).login().join();

        // Add a listener which answers with "Pong!" if someone writes "!ping"
        api.addMessageCreateListener(event -> {
            if (event.getMessageContent().equalsIgnoreCase("!ping")) {
                event.getChannel().sendMessage("Pong!");
            }
        });

        // Print the invite url of your bot
        System.out.println("You can invite the bot by using the following url: " + api.createBotInvite());
    }

}