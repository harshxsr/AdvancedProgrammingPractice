package accounts;

public class SavingsAccount extends Account {

    double interestRate;

    public SavingsAccount(String number, String name,
                          double balance, double rate) {

        super(number, name, balance);
        interestRate = rate;
    }

    public void displayDetails() {
        System.out.println("\nSavings Account");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Balance: ₹" + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}