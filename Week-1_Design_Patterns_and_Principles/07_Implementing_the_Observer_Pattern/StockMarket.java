import java.util.*;
public class StockMarket implements Stock {
    private List<Observer> observers = new ArrayList<>();
    private double price;
    public void setPrice(double p) {
        System.out.println("StockMarket: price changed to " + p);
        this.price = p;
        notifyObservers();
    }
    @Override 
    public void register(Observer o) { 
        observers.add(o); 
    }
    @Override 
    public void deregister(Observer o) { 
        observers.remove(o); 
    }
    @Override 
    public void notifyObservers() {
        for (Observer o : observers) o.update(price);
    }
}
