import java.util.*;
class Product implements Comparable<Product> {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    @Override
    public int compareTo(Product other) {
        return this.productId - other.productId;
    }

    @Override
    public String toString() {
        return "ProductID: " + productId + ", Name: " + productName + ", Category: " + category;
    }
}

public class ECommerceSearch {

    // Linear Search-Time Complexity-O(N)
    public static Product linearSearch(List<Product> products, int id) {
        for (Product p : products) {
            if (p.productId == id) return p;
        }
        return null;
    }

    // Binary Search (array must be sorted)-Time Complexity-O(nlogN)
    public static Product binarySearch(List<Product> sortedProducts, int id) {
        int left = 0, right = sortedProducts.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            Product midProduct = sortedProducts.get(mid);
            if (midProduct.productId == id) return midProduct;
            else if (midProduct.productId < id) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(101, "Shoes", "Fashion"));
        products.add(new Product(56, "Laptop", "Electronics"));
        products.add(new Product(78, "Bottle", "Home"));
        products.add(new Product(12, "Book", "Education"));

        // Linear search
        Product found = linearSearch(products, 78);
        System.out.println("Linear Search Found: " + found);

        // Sort for binary search
        Collections.sort(products);
        found = binarySearch(products, 78);
        System.out.println("Binary Search Found: " + found);
    }
}
