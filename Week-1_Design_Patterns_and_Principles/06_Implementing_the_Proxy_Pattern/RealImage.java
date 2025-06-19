public class RealImage implements Image {
    private String filename;
    public RealImage(String fn) {
        this.filename = fn;
        loadFromServer();
    }
    private void loadFromServer() {
        System.out.println("Loading '" + filename + "' from server...");
    }
    @Override 
    public void display() {
        System.out.println("Displaying image: " + filename);
    }
}
