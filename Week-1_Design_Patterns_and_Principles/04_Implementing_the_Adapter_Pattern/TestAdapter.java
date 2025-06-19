public class TestAdapter {
    public static void main(String[] args) {
        PaymentProcessor p1 = new StripeAdapter();
        p1.processPayment(100.0);
        System.out.println();

        PaymentProcessor p2 = new PaypalAdapter();
        p2.processPayment(200.0);
    }
}
