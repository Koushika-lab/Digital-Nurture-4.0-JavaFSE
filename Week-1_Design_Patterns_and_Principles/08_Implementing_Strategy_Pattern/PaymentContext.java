public class PaymentContext {
    private PaymentStrategy strategy;
    public PaymentContext(PaymentStrategy ps) { this.strategy = ps; }
    public void executePayment(double amount) {
        System.out.println("Context: processing payment...");
        strategy.pay(amount);
    }
}

