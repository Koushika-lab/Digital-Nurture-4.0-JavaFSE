public class PaypalAdapter implements PaymentProcessor {
    private PaypalSDK sdk = new PaypalSDK();
    @Override public void processPayment(double amount) {
        System.out.println("PaypalAdapter: adapting processPayment");
        sdk.sendPayment(amount);
    }
}