public class MobileApp implements Observer {
    @Override public void update(double price) {
        System.out.println("MobileApp received stock update: $" + price);
    }
}


