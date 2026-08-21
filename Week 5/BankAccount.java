class BankAccount {
    private int accountNumber;
    private String name;
    private double balance;

    BankAccount(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        if (amount <= balance)
            balance = balance - amount;
        else
            System.out.println("Insufficient balance");
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}

public class main {
    public static void main(String[] args) {
        BankAccount a = new BankAccount(101, "Arun", 5000);

        a.deposit(2000);
        a.withdraw(1000);

        a.display();
    }
}