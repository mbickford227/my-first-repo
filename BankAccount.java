public class BankAccount {

    // Attributes
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("$" + amount + " deposited.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    // Get balance
    public double getBalance() {
        return balance;
    }

    // Display account information
    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }

    // Main method for testing
    public static void main(String[] args) {

        BankAccount account =
                new BankAccount("123456", "John Smith", 1000.00);

        account.displayAccount();

        System.out.println("\nDepositing $500...");
        account.deposit(500);

        System.out.println("\nWithdrawing $300...");
        account.withdraw(300);

        System.out.println("\nCurrent Balance: $" +
                account.getBalance());
    }
}