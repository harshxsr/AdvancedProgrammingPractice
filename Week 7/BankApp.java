class BankTask implements Runnable {
    String activity; int delay;
    BankTask(String activity, int delay) { this.activity = activity; this.delay = delay; }
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + activity + " | Count: " + i);
            try { Thread.sleep(delay); } catch (InterruptedException e) {}
        }
    }
}
public class BankApp {
    public static void main(String[] args) {
        Thread t1 = new Thread(new BankTask("Transaction Processing", 400));
        Thread t2 = new Thread(new BankTask("Balance Updating", 600));
        Thread t3 = new Thread(new BankTask("SMS Notification", 300));
        t1.setName("TransactionThread"); t2.setName("BalanceThread"); t3.setName("SMSThread");
        t1.start(); t2.start(); t3.start();
    }
}