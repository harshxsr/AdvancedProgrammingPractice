import accounts.Account;
import accounts.CurrentAccount;
import accounts.SavingsAccount;
import java.util.Scanner;
import payments.CardPayment;
import payments.OnlineTransaction;
import payments.Payment;
import payments.UPIPayment;

public class BankingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ACCOUNT INPUT

        System.out.println("ACCOUNT DETAILS");

        System.out.print("Enter account number: ");
        String number = sc.nextLine();

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter balance: ");
        double balance = sc.nextDouble();

        System.out.println("\n1. Savings Account");
        System.out.println("2. Current Account");

        System.out.print("Enter account type: ");
        int type = sc.nextInt();

        Account account;

        if (type == 1) {

            System.out.print("Enter interest rate: ");
            double rate = sc.nextDouble();

            account = new SavingsAccount(
                    number, name, balance, rate
            );

        } else {

            System.out.print("Enter overdraft limit: ");
            double limit = sc.nextDouble();

            account = new CurrentAccount(
                    number, name, balance, limit
            );
        }

        // RUNTIME POLYMORPHISM

        account.displayDetails();

        System.out.println("\nPAYMENT");

        System.out.print("Enter payment amount: ");
        double amount = sc.nextDouble();

        System.out.println("1. UPI");
        System.out.println("2. Card");

        System.out.print("Enter payment method: ");
        int choice = sc.nextInt();

        Payment payment;

        if (choice == 1) {

            UPIPayment upi = new UPIPayment();

            payment = upi;

            payment.pay(amount);

            upi.verifyPayment();

            if (upi instanceof OnlineTransaction) {
                System.out.println(
                    "UPI is an online transaction."
                );
            }

        } else {

            CardPayment card = new CardPayment();

            payment = card;

            payment.pay(amount);

            if (card instanceof OnlineTransaction) {
                System.out.println(
                    "Card is an online transaction."
                );
            }
        }

        sc.close();
    }
}