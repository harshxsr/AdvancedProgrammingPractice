import doctor.Doctor;
import patient.Patient;
public class Hospital {
    public static void main(String[] args) {
        Doctor[] doctors = {
            new Doctor(1, "Ravi", "Cardiology", 500),
            new Doctor(2, "Meera", "Orthopedics", 400)
        };
        Patient[] patients = {
            new Patient(1, "Amit", "Cardiology", 45),
            new Patient(2, "Sara", "Orthopedics", 30),
            new Patient(3, "John", "Cardiology", 50)
        };
        for (Patient p : patients) {
            for (Doctor d : doctors) {
                if (d.getSpecialization().equalsIgnoreCase(p.getDisease())) {
                    p.display();
                    d.display();
                    d.addPatient();
                    System.out.println("---");
                }
            }
        }
        for (Doctor d : doctors) {
            System.out.println("Total collected: " + d.getTotalFee());
        }
    }
}