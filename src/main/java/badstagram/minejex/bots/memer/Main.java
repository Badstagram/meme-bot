package badstagram.minejex.bots.memer;

import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
;
import javax.security.auth.login.LoginException;
import java.util.Arrays;

public class Main {

    static JDABuilder builder = new JDABuilder();
    static JDA jda = null;

    public static void main(String[] args) {
        connect(secrets.DISCORD);
    }


    static void connect(String token) {
        try {
            jda = builder
                    .setAudioEnabled(false)
                    .setToken(token)
                    .addEventListener(new listener())
                    .build().awaitReady();

        } catch (LoginException e) {
            Logger.error(Arrays.toString(e.getStackTrace()));
        } catch (InterruptedException e) {
            Logger.error(Arrays.toString(e.getStackTrace()));
        }
    }
}
