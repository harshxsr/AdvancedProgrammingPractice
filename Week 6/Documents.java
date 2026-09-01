import java.util.Scanner;

interface Confidential {
}

class Document {
    String name;

    Document(String name) {
        this.name = name;
    }
}

class PublicDocument extends Document {

    PublicDocument(String name) {
        super(name);
    }
}

class PrivateDocument extends Document implements Confidential {

    PrivateDocument(String name) {
        super(name);
    }
}

class CompanyDocument extends Document implements Confidential {

    CompanyDocument(String name) {
        super(name);
    }
}

public class Documents {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter document name: ");
        String name = sc.nextLine();

        System.out.println("\n1. Public Document");
        System.out.println("2. Private Document");
        System.out.println("3. Company Document");

        System.out.print("Enter document type: ");
        int choice = sc.nextInt();

        Document d;

        if (choice == 1) {
            d = new PublicDocument(name);
        }
        else if (choice == 2) {
            d = new PrivateDocument(name);
        }
        else {
            d = new CompanyDocument(name);
        }

        if (d instanceof Confidential) {
            System.out.println("Document is Confidential.");
        }
        else {
            System.out.println("Document is not Confidential.");
        }

        sc.close();
    }
}