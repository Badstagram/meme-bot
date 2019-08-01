package badstagram.minejex.bots.memer;

public class Logger {
    public static void log(String message) {
        System.out.println(String.format("[LOG] %s", message));
    }

    public static void warn(String message) {
        System.out.println(String.format("[WARN] %s", message));
    }

    public static void error(String message) {
        System.out.println(String.format("[ERROR] %s", message));
    }
}
