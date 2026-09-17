class Junction extends Thread {
    String status; int delay;
    Junction(String name, String status, int delay) {
        super(name); this.status = status; this.delay = delay;
    }
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " - Status: " + status + " (" + i + ")");
            try { Thread.sleep(delay); } catch (InterruptedException e) {}
        }
    }
}
public class TrafficSystem {
    public static void main(String[] args) {
        Junction j1 = new Junction("Junction-A", "Heavy Traffic", 500);
        Junction j2 = new Junction("Junction-B", "Moderate Traffic", 700);
        Junction j3 = new Junction("Junction-C", "Light Traffic", 900);
        j1.start(); j2.start(); j3.start();
    }
}