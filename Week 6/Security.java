import java.util.Scanner;

interface BasicSecurity {
    void login();
    void logout();
}

interface AdvancedSecurity extends BasicSecurity {
    void fingerprintAuthentication();
    void faceAuthentication();
}

class BankingApplication implements AdvancedSecurity {

    public void login() {
        System.out.println("Login successful.");
    }

    public void logout() {
        System.out.println("Logout successful.");
    }

    public void fingerprintAuthentication() {
        System.out.println("Fingerprint authentication successful.");
    }

    public void faceAuthentication() {
        System.out.println("Face recognition successful.");
    }
}

public class Security {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankingApplication app = new BankingApplication();

        System.out.println("1. Login");
        System.out.println("2. Fingerprint");
        System.out.println("3. Face Recognition");
        System.out.println("4. Logout");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                app.login();
                break;

            case 2:
                app.fingerprintAuthentication();
                break;

            case 3:
                app.faceAuthentication();
                break;

            case 4:
                app.logout();
                break;

            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
