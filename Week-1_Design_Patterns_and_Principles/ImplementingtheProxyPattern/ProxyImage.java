package ImplementingtheProxyPattern;
public class ProxyImage implements Image {
    private RealImage realImage;
    private String filename;
    public ProxyImage(String fn) { this.filename = fn; }
    @Override public void display() {
        if (realImage == null) {
            System.out.println("ProxyImage: Loading image lazily...");
            realImage = new RealImage(filename);
        } else {
            System.out.println("ProxyImage: Using cached image...");
        }
        realImage.display();
    }
}
