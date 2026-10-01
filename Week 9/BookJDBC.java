import java.sql.*;
import java.util.Scanner;

public class BookJDBC {

    public static void main(String[] args) throws Exception {

        // DATABASE CONNECTION
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/college",
            "root",
            "password"
        );

        Scanner sc = new Scanner(System.in);

        // INSERT BOOK
        System.out.print("Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Title: ");
        String title = sc.nextLine();

        System.out.print("Author: ");
        String author = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        PreparedStatement ps = con.prepareStatement(
            "INSERT INTO Book VALUES(?,?,?,?,?)"
        );

        ps.setInt(1, id);
        ps.setString(2, title);
        ps.setString(3, author);
        ps.setDouble(4, price);
        ps.setBoolean(5, true);

        ps.executeUpdate();

        System.out.println("Book inserted.");

        // SEARCH BOOK
        System.out.print("Enter Book ID to search: ");
        int searchId = sc.nextInt();

        ps = con.prepareStatement(
            "SELECT * FROM Book WHERE BookID=?"
        );

        ps.setInt(1, searchId);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {

            System.out.println(
                "Book ID: " +
                rs.getInt("BookID")
            );

            System.out.println(
                "Title: " +
                rs.getString("Title")
            );

            System.out.println(
                "Author: " +
                rs.getString("Author")
            );

            System.out.println(
                "Price: " +
                rs.getDouble("Price")
            );

            System.out.println(
                "Available: " +
                rs.getBoolean("Availability")
            );

        } else {

            System.out.println("Book not found.");
        }

        // DISPLAY AVAILABLE BOOKS
        ps = con.prepareStatement(
            "SELECT * FROM Book WHERE Availability=true"
        );

        rs = ps.executeQuery();

        System.out.println("\nAvailable Books:");

        while (rs.next()) {

            System.out.println(
                rs.getInt("BookID") +
                " - " +
                rs.getString("Title")
            );
        }

        // ISSUE BOOK
        System.out.print("\nEnter Book ID to issue: ");

        int issueId = sc.nextInt();

        ps = con.prepareStatement(
            "UPDATE Book SET Availability=false WHERE BookID=?"
        );

        ps.setInt(1, issueId);

        ps.executeUpdate();

        System.out.println("Book issued.");

        con.close();
    }
}