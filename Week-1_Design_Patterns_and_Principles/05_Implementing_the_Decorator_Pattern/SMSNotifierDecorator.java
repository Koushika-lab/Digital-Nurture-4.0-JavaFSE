public class SMSNotifierDecorator extends NotifierDecorator { //Concrete decorator
    public SMSNotifierDecorator(Notifier n) { super(n); }
    @Override public void send(String msg) {
        wrappee.send(msg);
        System.out.println("SMS sent: " + msg);
    }
}