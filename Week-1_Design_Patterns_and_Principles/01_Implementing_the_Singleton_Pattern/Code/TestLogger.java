
public class TestLogger {
    public static void main(String[] args) {
        System.out.println("Requesting first logger instance...");
        Logger logger1 = Logger.getInstance();

        System.out.println("\nRequesting second logger instance...");
        Logger logger2 = Logger.getInstance();

        System.out.println("\nLogging message using logger1:");
        logger1.log("First Message");

        System.out.println("\nChecking if both logger instances are the same:");
        System.out.println("logger1 == logger2 : " + (logger1 == logger2));
    }
}
