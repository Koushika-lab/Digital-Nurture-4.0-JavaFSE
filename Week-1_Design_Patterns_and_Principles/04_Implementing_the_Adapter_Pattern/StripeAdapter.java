public class StripeAdapter implements PaymentProcessor {
    private StripeSDK sdk = new StripeSDK();
    @Override public void processPayment(double amount) {
        System.out.println("StripeAdapter: adapting processPayment");
        sdk.makePayment(amount);
    }
}

