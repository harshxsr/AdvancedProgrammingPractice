package patient;
public class Patient {
    private int patientId; private String name, disease; private int age;
    public Patient(int id, String name, String disease, int age) {
        patientId = id; this.name = name; this.disease = disease; this.age = age;
    }
    public String getDisease() { return disease; }
    public void display() {
        System.out.println("Patient: " + name + " (ID:" + patientId + "), Disease: " + disease + ", Age: " + age);
    }
}
