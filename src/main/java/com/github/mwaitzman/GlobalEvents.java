package com.github.mwaitzman;

public class GlobalEvents {

    /* Uwu Response
    * <Description_Short>: sends phallic images to a user when said user says uwu
    * </Description_Short>
    * <Description_Long>: amount of images sent depends on the number of previous offenses by that user
    * </Description_Long>
     */
    onEvent(MessageSentFromOthers {
        if ( message.toLowerCase().equals("uwu) ) {
        for (int i = 0; i < message.getSender().get("UwU Offenses"); i++) {
            new MessageBuilder()
                    .addText("You have said uwu. This is what you get")
                    .addImage("phallicImage0.png")
                    .build()
                    .sendToDM(get(message.author());
        }
    }
}

}
