package ConditionalAndLogic;

import java.util.*;

public class TemperatureScaleConverter {
    public static void TemperatureScale(Double value, String scale) {
        switch (scale) {
            case "C":
                Double fahrenheit = value * (9.0 / 5.0) + 32;
                Double kelvin = value + 273.15;
                System.out.println("F=" + fahrenheit + " K=" + kelvin);
                break;
            case "F":
                Double celcius = (value - 32) * (5.0 / 9.0);
                Double kelvin2 = (value - 32) * (5.0 / 9.0) + 273.15;
                System.out.println("C=" + celcius + " K=" + kelvin2);
                break;
            case "K":
                Double celcius2 = value - 273.15;
                Double fahrenheit2 = ((value - 273.15) * (9.0 / 5.0)) + 32;
                System.out.println("C=" + celcius2 + " F=" + fahrenheit2);
                break;
            default:
                System.out.println("Error: Invalid temperature scale");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double t = sc.nextDouble();
        String scale = sc.next();
        sc.close();
        TemperatureScale(t, scale);
    }
}
