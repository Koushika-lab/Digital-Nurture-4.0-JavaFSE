package Code;
import java.util.HashMap;
import java.util.Map;

// Product class
class Product {
    int productId;
    String productName;
    int quantity;
    double price;

    public Product(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[" + productId + "] " + productName + " - Qty: " + quantity + " | Price: $" + price;
    }
}
// Inventory Management class
public class InventoryManagementSystem {
    Map<Integer, Product> inventory;

    public InventoryManagementSystem() {
        inventory = new HashMap<>();
    }

    // Add a new product
    public void addProduct(Product product) {
        if (inventory.containsKey(product.productId)) {
            System.out.println("Product ID already exists. Use updateProduct.");
        } else {
            inventory.put(product.productId, product);
            System.out.println("Product added.");
        }
    }

    // Update an existing product
    public void updateProduct(int productId, String newName, int newQuantity, double newPrice) {
        if (inventory.containsKey(productId)) {
            Product product = inventory.get(productId);
            product.productName = newName;
            product.quantity = newQuantity;
            product.price = newPrice;
            System.out.println("Product updated.");
        } else {
            System.out.println("Product not found.");
        }
    }

    // Delete a product
    public void deleteProduct(int productId) {
        if (inventory.remove(productId) != null) {
            System.out.println("Product deleted.");
        } else {
            System.out.println("Product not found.");
        }
    }

    // Display all products
    public void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            for (Product product : inventory.values()) {
                System.out.println(product);
            }
        }
    }

    // Main method to test
    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();

        ims.addProduct(new Product(101, "Laptop", 10, 75000.0));
        ims.addProduct(new Product(102, "Phone", 25, 15000.0));
        ims.displayInventory();

        ims.updateProduct(102, "Smartphone", 30, 17000.0);
        ims.displayInventory();

        ims.deleteProduct(101);
        ims.displayInventory();
    }
}
