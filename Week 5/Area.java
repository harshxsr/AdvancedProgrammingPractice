import java.util.Scanner;

abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    double calculateArea() {
        return 0.5 * base * height;
    }
}

public class Area {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        System.out.print("Enter length and width: ");
        double l = sc.nextDouble();
        double w = sc.nextDouble();

        System.out.print("Enter base and height: ");
        double b = sc.nextDouble();
        double h = sc.nextDouble();

        Shape s1 = new Circle(r);
        Shape s2 = new Rectangle(l, w);
        Shape s3 = new Triangle(b, h);

        System.out.println("Circle area: " + s1.calculateArea());
        System.out.println("Rectangle area: " + s2.calculateArea());
        System.out.println("Triangle area: " + s3.calculateArea());
    }
}