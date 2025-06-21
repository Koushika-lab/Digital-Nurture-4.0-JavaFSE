package Code;
class Order {
    int orderId;
    String customerName;
    double totalPrice;

    public Order(int orderId, String customerName, double totalPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Order[" + orderId + "] - " + customerName + " - $" + totalPrice;
    }
}

public class OrderSorting {

    // Bubble Sort
    public static void bubbleSort(Order[] orders) {
        int n = orders.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (orders[j].totalPrice > orders[j + 1].totalPrice) {
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // optimization
        }
    }

    // Quick Sort
    public static void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pi = partition(orders, low, high);
            quickSort(orders, low, pi - 1);
            quickSort(orders, pi + 1, high);
        }
    }

    private static int partition(Order[] orders, int low, int high) {
        double pivot = orders[high].totalPrice;
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (orders[j].totalPrice <= pivot) {
                i++;
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }
        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;
        return i + 1;
    }

    // Utility: Print orders
    public static void printOrders(Order[] orders) {
        for (Order order : orders) {
            System.out.println(order);
        }
    }

    // Main method
    public static void main(String[] args) {
        Order[] orders = {
            new Order(1001, "Alice", 4500.00),
            new Order(1002, "Bob", 2300.00),
            new Order(1003, "Charlie", 8700.00),
            new Order(1004, "Daisy", 1200.00)
        };

        System.out.println("Original Orders:");
        printOrders(orders);

        // Bubble Sort
        System.out.println("\nSorted by Bubble Sort:");
        bubbleSort(orders);
        printOrders(orders);

        // Resetting orders
        orders = new Order[]{
            new Order(1001, "Alice", 4500.00),
            new Order(1002, "Bob", 2300.00),
            new Order(1003, "Charlie", 8700.00),
            new Order(1004, "Daisy", 1200.00)
        };

        // Quick Sort
        System.out.println("\nSorted by Quick Sort:");
        quickSort(orders, 0, orders.length - 1);
        printOrders(orders);
    }
}

