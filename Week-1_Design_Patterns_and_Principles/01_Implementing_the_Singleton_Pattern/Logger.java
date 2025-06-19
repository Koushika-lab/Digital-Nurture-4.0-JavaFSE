public class Logger {
    private static Logger instance;

    private Logger() {
        System.out.println("Logger Initialized: New Instance Created");
    }

    public static Logger getInstance() {
        if (instance == null) {
            System.out.println("getInstance() called - Instance is null, creating new one...");
            instance = new Logger();
        } else {
            System.out.println("getInstance() called - Returning existing instance...");
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
