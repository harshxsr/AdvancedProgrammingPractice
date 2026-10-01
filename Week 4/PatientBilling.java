import java.util.Scanner;

public class PatientBilling {

    String patientName;
    double consultationFee;

    PatientBilling(String patientName, double consultationFee) {
        this.patientName = patientName;
        this.consultationFee = consultationFee;
    }

    double calculateFinalAmount(double fee) {
        double discount;

        if (fee >= 2000) {
            discount = fee * 0.10;
        } else {
            discount = fee * 0.05;
        }

        return fee - discount;
    }

    void display() {
        double finalAmount = calculateFinalAmount(consultationFee);
        double discount = consultationFee - finalAmount;

        System.out.println("\nPatient Name: " + patientName);
        System.out.println("Original Consultation Fee: ₹" + consultationFee);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Amount: ₹" + finalAmount);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PatientBilling[] patients = new PatientBilling[5];

        for (int i = 0; i < 5; i++) {

            System.out.println("\nPatient " + (i + 1));

            System.out.print("Patient Name: ");
            String name = sc.nextLine();

            System.out.print("Consultation Fee: ");
            double fee = sc.nextDouble();
            sc.nextLine();

            patients[i] = new PatientBilling(name, fee);
        }

        System.out.println("\n===== CONSULTATION BILL =====");

        for (int i = 0; i < 5; i++) {
            patients[i].display();
        }

        sc.close();
    }
}