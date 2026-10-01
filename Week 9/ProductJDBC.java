import java.sql.*;
import java.util.Scanner;

public class ProductJDBC {

    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/college",
            "root",
            "password"
        );

        Scanner sc = new Scanner(System.in);

        // INSERT
        System.out.print("Product ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Product Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        System.out.print("Quantity: ");
        int quantity = sc.nextInt();

        PreparedStatement ps = con.prepareStatement(
            "INSERT INTO Product VALUES(?,?,?,?)"
        );

        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setDouble(3, price);
        ps.setInt(4, quantity);

        ps.executeUpdate();

        System.out.println("Product inserted.");

        // RETRIEVE
        System.out.print(
            "Enter Product ID to search: "
        );

        int searchId = sc.nextInt();

        ps = con.prepareStatement(
            "SELECT * FROM Product WHERE ProductID=?"
        );

        ps.setInt(1, searchId);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {

            System.out.println(
                "Product ID: " +
                rs.getInt("ProductID")
            );

            System.out.println(
                "Name: " +
                rs.getString("ProductName")
            );

            System.out.println(
                "Price: " +
                rs.getDouble("Price")
            );

            System.out.println(
                "Quantity: " +
                rs.getInt("Quantity")
            );
        }

        // UPDATE QUANTITY
        System.out.print(
            "Enter new quantity: "
        );

        int newQuantity = sc.nextInt();

        ps = con.prepareStatement(
            "UPDATE Product SET Quantity=? WHERE ProductID=?"
        );

        ps.setInt(1, newQuantity);
        ps.setInt(2, searchId);

        ps.executeUpdate();

        System.out.println("Quantity updated.");

        // LOW STOCK PRODUCTS
        ps = con.prepareStatement(
            "SELECT * FROM Product WHERE Quantity < 10"
        );

        rs = ps.executeQuery();

        System.out.println(
            "\nProducts with quantity below 10:"
        );

        while (rs.next()) {

            System.out.println(
                rs.getInt("ProductID") +
                " " +
                rs.getString("ProductName") +
                " Quantity: " +
                rs.getInt("Quantity")
            );
        }

        con.close();
    }
}