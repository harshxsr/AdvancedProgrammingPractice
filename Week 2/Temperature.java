class TemperatureDetails {
    double celsius;

    void convert() {
        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Celsius : " + celsius);
        System.out.println("Fahrenheit : " + fahrenheit);
    }
}

public class Temperature {
    public static void main(String[] args) {

        TemperatureDetails t = new TemperatureDetails();

        t.celsius = 25;

        t.convert();
    }
}