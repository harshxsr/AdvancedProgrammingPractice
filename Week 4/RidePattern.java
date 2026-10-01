public class RidePattern {

    int rideNumber;
    String rideName;

    RidePattern(int rideNumber, String rideName) {
        this.rideNumber = rideNumber;
        this.rideName = rideName;
    }

    void displayPattern() {
        System.out.print(rideName + " : ");

        for (int i = 1; i <= rideNumber; i++) {
            System.out.print("*");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        RidePattern[] rides = new RidePattern[5];

        rides[0] = new RidePattern(1, "Roller Coaster");
        rides[1] = new RidePattern(2, "Ferris Wheel");
        rides[2] = new RidePattern(3, "Bumper Cars");
        rides[3] = new RidePattern(4, "Water Ride");
        rides[4] = new RidePattern(5, "Haunted House");

        for (int i = 0; i < 5; i++) {
            rides[i].displayPattern();
        }
    }
}