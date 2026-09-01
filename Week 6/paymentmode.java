import java.util.Scanner;

interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {

    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}

class UPIPayment implements Payment {

    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI.");
    }
}

class NetBankingPayment implements Payment {

    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Net Banking.");
    }
}

public class paymentmode {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        System.out.println("\n1. Credit Card");
        System.out.println("2. UPI");
        System.out.println("3. Net Banking");

        System.out.print("Enter payment method: ");
        int choice = sc.nextInt();

        Payment p;

        if (choice == 1) {
            p = new CreditCardPayment();
        }
        else if (choice == 2) {
            p = new UPIPayment();
        }
        else {
            p = new NetBankingPayment();
        }

        p.pay(amount);

        sc.close();
    }
}