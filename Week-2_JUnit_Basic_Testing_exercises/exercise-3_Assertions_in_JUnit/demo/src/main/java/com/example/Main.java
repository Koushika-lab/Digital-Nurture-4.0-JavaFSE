package com.example;

public class Main {
    public static void main(String[] args) {
        // Simulating assertEquals(5, 2 + 3)
        if ((2 + 3) != 5) {
            System.out.println("assertEquals failed");
        } else {
            System.out.println("assertEquals passed");
        }

        // Simulating assertTrue(5 > 3)
        if (!(5 > 3)) {
            System.out.println("assertTrue failed");
        } else {
            System.out.println("assertTrue passed");
        }

        // Simulating assertFalse(5 < 3)
        if (5 < 3) {
            System.out.println("assertFalse failed");
        } else {
            System.out.println("assertFalse passed");
        }

        // Simulating assertNull(null)
        Object obj1 = null;
        if (obj1 != null) {
            System.out.println("assertNull failed");
        } else {
            System.out.println("assertNull passed");
        }

        // Simulating assertNotNull(new Object())
        Object obj2 = new Object();
        if (obj2 == null) {
            System.out.println("assertNotNull failed");
        } else {
            System.out.println("assertNotNull passed");
        }
    }
}
