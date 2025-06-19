public class WebApp implements Observer {
    @Override 
    public void update(double price) {
        System.out.println("WebApp received stock update: $" + price);
    }
}