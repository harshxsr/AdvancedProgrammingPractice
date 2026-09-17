class ExamTask implements Runnable {
    String activity; int delay;
    ExamTask(String activity, int delay) { this.activity = activity; this.delay = delay; }
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + activity + " (" + i + ")");
            try { Thread.sleep(delay); } catch (InterruptedException e) {}
        }
    }
}
public class ExamSystem {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ExamTask("Displaying remaining time", 500));
        Thread t2 = new Thread(new ExamTask("Auto-saving answers", 800));
        Thread t3 = new Thread(new ExamTask("Checking network", 1000));
        t1.setName("TimerThread"); t2.setName("SaveThread"); t3.setName("NetworkThread");
        t1.start(); t2.start(); t3.start();
    }
}