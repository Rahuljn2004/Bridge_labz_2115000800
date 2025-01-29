import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        double temp = getInput("Enter temperature: ");
        String scale = getInputScale();

        if (scale.equalsIgnoreCase("C")) {
            System.out.println("In Fahrenheit: " + celsiusToFahrenheit(temp));
        } else if (scale.equalsIgnoreCase("F")) {
            System.out.println("In Celsius: " + fahrenheitToCelsius(temp));
        } else {
            System.out.println("Invalid scale input.");
        }
    }

    public static double getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public static String getInputScale() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter scale (C for Celsius, F for Fahrenheit): ");
        return scanner.nextLine();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
