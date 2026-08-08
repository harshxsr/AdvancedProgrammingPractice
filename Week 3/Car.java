public class Car {

    String model;
    double price;

    Car() {
        model = "Not Available";
        price = 0;
    }

    Car(String model) {
        this.model = model;
        price = 0;
    }

    Car(String model, double price) {
        this.model = model;
        this.price = price;
    }

    void display() {
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
        System.out.println();
    }

    public static void main(String[] args) {

        Car c1 = new Car();

        Car c2 = new Car("Hyundai Creta");

        Car c3 = new Car("Hyundai Creta", 1800000);

        System.out.println("Customer 1");
        c1.display();

        System.out.println("Customer 2");
        c2.display();

        System.out.println("Customer 3");
        c3.display();
    }
}