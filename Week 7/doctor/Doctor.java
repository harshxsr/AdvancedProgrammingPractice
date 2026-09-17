package doctor;
public class Doctor {
    private int doctorId; private String name, specialization; private double consultationFee;
    private int patientCount = 0;
    public Doctor(int id, String name, String spec, double fee) {
        doctorId = id; this.name = name; specialization = spec; consultationFee = fee;
    }
    public String getSpecialization() { return specialization; }
    public double getFee() { return consultationFee; }
    public void addPatient() { patientCount++; }
    public double getTotalFee() { return patientCount * consultationFee; }
    public void display() {
        System.out.println("Dr. " + name + " (ID:" + doctorId + ") - " + specialization + ", Fee: " + consultationFee);
    }
}