import java.util.Scanner;

public class MenuProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        int x = 0, y = 0;
        boolean numbersEntered = false;

        while (choice != 5) {
            System.out.println("\n--- Menu ---");
            System.out.println("1 - Enter two (2) numbers (x and y)");
            System.out.println("2 - Print all numbers between x and y");
            System.out.println("3 - Find the average of all numbers between x and y");
            System.out.println("4 - Find all prime numbers between x and y");
            System.out.println("5 - Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter x: ");
                    x = input.nextInt();
                    System.out.print("Enter y: ");
                    y = input.nextInt();
                    numbersEntered = true;
                    break;

                case 2:
                    if (!numbersEntered) { System.out.println("Please enter numbers first (Option 1)."); break; }
                    for (int i = Math.min(x, y); i <= Math.max(x, y); i++) 
                        System.out.print(i + " ");
                    System.out.println();
                    break;

                case 3:
                    if (!numbersEntered) { System.out.println("Please enter numbers first (Option 1)."); break; }
                    double sum = 0, count = 0;
                    for (int i = Math.min(x, y); i <= Math.max(x, y); i++) {
                        sum += i;
                        count++;
                    }
                    System.out.println("Average: " + (sum / count));
                    break;

                case 4:
                    if (!numbersEntered) { System.out.println("Please enter numbers first (Option 1)."); break; }
                    System.out.print("Primes: ");
                    for (int i = Math.min(x, y); i <= Math.max(x, y); i++) {
                        if (isPrime(i)) System.out.print(i + " ");
                    }
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        input.close();
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}