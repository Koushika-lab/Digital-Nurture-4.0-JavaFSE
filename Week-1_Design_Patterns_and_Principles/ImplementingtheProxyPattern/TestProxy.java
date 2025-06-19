package ImplementingtheProxyPattern;
public class TestProxy {
    public static void main(String[] args) {
        Image img = new ProxyImage("photo.jfif");
        img.display(); System.out.println();
        img.display();
    }
}
