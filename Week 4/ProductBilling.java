import java.util.Scanner;

public class ProductBilling {

    int productId;
    String productName;
    double price;
    int quantity;

    ProductBilling(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    void display() {
        double totalPrice = price * quantity;
        double discount;

        if (totalPrice >= 5000)
            discount = totalPrice * 0.10;
        else
            discount = totalPrice * 0.05;

        double finalPrice = totalPrice - discount;

        System.out.println("\nProduct ID: " + productId);
        System.out.println("Name: " + productName);
        System.out.println("Total Price: ₹" + totalPrice);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Price: ₹" + finalPrice);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ProductBilling[] products = new ProductBilling[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("\nProduct " + (i + 1));

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            products[i] = new ProductBilling(id, name, price, quantity);
        }

        System.out.println("\n----- BILL DETAILS -----");

        for (int i = 0; i < 5; i++) {
            products[i].display();
        }

        sc.close();
    }
}