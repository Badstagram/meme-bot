package badstagram.minejex.bots.memer;

import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;


public class listener  {

    public void onMessageReceivedEvent(GuildMessageReceivedEvent event) {
        Message message = event.getMessage();
        String content = message.getContentRaw();
        String[] args = content.split("\\S+");

        if (content.equalsIgnoreCase(config.PREFIX + "meme")) {
            

        }
    }

}
