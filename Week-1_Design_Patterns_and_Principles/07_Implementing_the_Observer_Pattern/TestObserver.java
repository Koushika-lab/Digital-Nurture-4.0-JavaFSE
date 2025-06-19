public class TestObserver {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();
        Observer m = new MobileApp(), w = new WebApp();
        market.register(m); market.register(w);
        market.setPrice(123.45);
        System.out.println();
        market.deregister(w);
        market.setPrice(200.00);
    }
}
