class EmergencyAlert extends Thread {
    public void run() {
        System.out.println(getName() + " - Priority: " + getPriority());
        System.out.println("Handling critical patient alerts");
    }
}

class VitalMonitor extends Thread {
    public void run() {
        System.out.println(getName() + " - Priority: " + getPriority());
        System.out.println("Monitoring vital signs");
    }
}

class ReportGenerator extends Thread {
    public void run() {
        System.out.println(getName() + " - Priority: " + getPriority());
        System.out.println("Generating routine reports");
    }
}

public class HospitalMonitoring {
    public static void main(String[] args) {

        EmergencyAlert e = new EmergencyAlert();
        VitalMonitor v = new VitalMonitor();
        ReportGenerator r = new ReportGenerator();

        e.setName("EmergencyAlert");
        v.setName("VitalMonitor");
        r.setName("ReportGenerator");

        e.setPriority(Thread.MAX_PRIORITY); // 10
        v.setPriority(Thread.NORM_PRIORITY); // 5
        r.setPriority(Thread.MIN_PRIORITY); // 1

        e.start();
        v.start();
        r.start();
    }
}