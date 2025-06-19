public class EmailNotifier implements Notifier {  //Concrete Component
    @Override public void send(String msg) { 
        System.out.println("Email sent: " + msg); 
    }
}
