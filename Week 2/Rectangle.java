class Rect {
    double length;
    double breadth;

    void calculateArea() {
        double area = length * breadth;
        System.out.println("Area : " + area);
    }
}

public class Rectangle {
    public static void main(String[] args) {

        Rect r = new Rect();

        r.length = 10;
        r.breadth = 5;

        r.calculateArea();
    }
}