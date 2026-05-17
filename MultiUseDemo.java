public class MultiUseDemo {
    
    // Method with one integer parameter - prints numbers from 1 to n
    public static void multiUse(int n) {
        System.out.println("Printing numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // New line after printing
    }
    
    // Method with two parameters - calculates and returns the average
    public static void multiUse(int a, int b) {
        double average = (a + b) / 2.0;
        System.out.println("Average of " + a + " and " + b + " is: " + average);
    }
    
    // Method with three parameters - finds and returns the maximum
    public static void multiUse(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("Maximum of " + a + ", " + b + ", and " + c + " is: " + max);
    }
    
    public static void main(String[] args) {
        System.out.println("=== Method Overloading Demo ===\n");
        
        // Test with one parameter
        System.out.println("Testing with 1 parameter:");
        multiUse(5);
        System.out.println();
        
        // Test with two parameters
        System.out.println("Testing with 2 parameters:");
        multiUse(10, 20);
        System.out.println();
        
        // Test with three parameters
        System.out.println("Testing with 3 parameters:");
        multiUse(15, 8, 22);
        System.out.println();
        
        // Additional test cases
        System.out.println("=== Additional Test Cases ===");
        multiUse(3);              // Prints 1,2,3
        multiUse(100, 50);       // Average of 100 and 50
        multiUse(7, 12, 4);      // Maximum of 7,12,4
    }
}