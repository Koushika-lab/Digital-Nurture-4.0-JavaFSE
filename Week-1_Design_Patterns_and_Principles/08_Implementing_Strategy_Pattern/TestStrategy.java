public class TestStrategy {
    public static void main(String[] args) {
        PaymentContext ctx1 = new PaymentContext(new CreditCardPayment());
        ctx1.executePayment(50.0);
        System.out.println();
        PaymentContext ctx2 = new PaymentContext(new PayPalPayment());
        ctx2.executePayment(75.5);
    }
}
