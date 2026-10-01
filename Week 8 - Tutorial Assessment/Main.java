class RideRequest extends Thread {

    String[] rides;
    static String[] drivers = {"D1", "D2", "D3"};
    static int driver = 0;

    RideRequest(String[] rides) {
        this.rides = rides;
    }

    public void run() {
        for(int i = 0; i < rides.length; i++) {
            assignDriver(rides[i]);
        }
    }

    synchronized static void assignDriver(String ride) {
        if(driver < drivers.length) {
            System.out.println(ride + " assigned to " + drivers[driver]);
            driver++;
        }
        else {

            System.out.println(ride + " - No driver available");
        }
    }
}

class Main {
    public static void main(String[] args) {

        String[] rides1 = {"R1", "R2", "R3"};
        String[] rides2 = {"R4", "R5"};

        RideRequest t1 = new RideRequest(rides1);
        RideRequest t2 = new RideRequest(rides2);

        t1.start();
        t2.start();
    }
}