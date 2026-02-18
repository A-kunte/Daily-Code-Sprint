class Account {
    private String owner;
    private double balance;
    private double[] history = new double[4];
    private int historyIndex = 0;

    public static double interestRate = 0.05;

    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            recordTransaction(amount);
            System.out.println(" Deposited ₹" + amount);
        }
    }

    private void recordTransaction(double amount) {
        history[historyIndex % 3] = amount;
        historyIndex++;
    }

    public void applyInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println(" Interest added: ₹" + interest);
    }

    public void showStatus() {
        System.out.println("\n--- " + owner + "'s Statement ---");
        System.out.println("Balance: ₹" + balance);
        System.out.print("Recent Transactions: ");
        for (double entry : history) {
            if (entry != 0)
                System.out.print("[" + entry + "] ");
        }
        System.out.println("\n-----------------------");
    }
}

public class AdvancedBank {
    public static void main(String[] args) {
        Account user = new Account("ABCD", 1000.0);

        user.deposit(200);
        user.deposit(50);
        user.deposit(150);
        user.deposit(300);

        user.applyInterest();
        user.showStatus();
    }
}