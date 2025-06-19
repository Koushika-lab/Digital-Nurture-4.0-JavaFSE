public class SlackNotifierDecorator extends NotifierDecorator { // Concrete decorator
    public SlackNotifierDecorator(Notifier n) { super(n); }
    @Override public void send(String msg) {
        wrappee.send(msg);
        System.out.println("Slack sent: " + msg);
    }
}