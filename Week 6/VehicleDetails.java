import java.util.Scanner;

class Vehicle {
    String vehicleNumber;
    String brand;
    double speed;

    Vehicle(String vehicleNumber, String brand, double speed) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.speed = speed;
    }

    void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    Car(String number, String brand, double speed, int doors) {
        super(number, brand, speed);
        numberOfDoors = doors;
    }

    void displayDetails() {
        System.out.println("\nCar Details");
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

class Bike extends Vehicle {
    boolean hasGear;

    Bike(String number, String brand, double speed, boolean gear) {
        super(number, brand, speed);
        hasGear = gear;
    }

    void displayDetails() {
        System.out.println("\nBike Details");
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Has Gear: " + hasGear);
    }
}

public class VehicleDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter car number: ");
        String carNo = sc.nextLine();

        System.out.print("Enter car brand: ");
        String carBrand = sc.nextLine();

        System.out.print("Enter car speed: ");
        double carSpeed = sc.nextDouble();

        System.out.print("Enter number of doors: ");
        int doors = sc.nextInt();

        Vehicle v;

        v = new Car(carNo, carBrand, carSpeed, doors);
        v.displayDetails();

        sc.nextLine();

        System.out.print("\nEnter bike number: ");
        String bikeNo = sc.nextLine();

        System.out.print("Enter bike brand: ");
        String bikeBrand = sc.nextLine();

        System.out.print("Enter bike speed: ");
        double bikeSpeed = sc.nextDouble();

        System.out.print("Does bike have gear? (true/false): ");
        boolean gear = sc.nextBoolean();

        v = new Bike(bikeNo, bikeBrand, bikeSpeed, gear);
        v.displayDetails();

        sc.close();
    }
}