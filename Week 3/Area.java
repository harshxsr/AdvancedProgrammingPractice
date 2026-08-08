import java.util.Scanner;

public class Area {

    void calculateArea(int side) {
        System.out.println("Area of Square = " + (side * side));
    }

    void calculateArea(int length, int breadth) {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }

    void calculateArea(double radius) {
        System.out.println("Area of Circle = " + (3.14 * radius * radius));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Area obj = new Area();

        System.out.print("Enter side of square: ");
        int side = sc.nextInt();
        obj.calculateArea(side);

        System.out.print("\nEnter length and breadth of rectangle: ");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        obj.calculateArea(length, breadth);

        System.out.print("\nEnter radius of circle: ");
        double radius = sc.nextDouble();
        obj.calculateArea(radius);

        sc.close();
    }
}