package accounts;

public class CurrentAccount extends Account {

    double overdraftLimit;

    public CurrentAccount(String number, String name,
                          double balance, double limit) {

        super(number, name, balance);
        overdraftLimit = limit;
    }

    public void displayDetails() {
        System.out.println("\nCurrent Account");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Balance: ₹" + balance);
        System.out.println("Overdraft Limit: ₹" + overdraftLimit);
    }
}