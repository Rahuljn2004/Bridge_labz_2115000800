import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        double num1 = getInput("Enter first number: ");
        double num2 = getInput("Enter second number: ");
        String operation = getOperation();

        double result = performOperation(num1, num2, operation);
        System.out.println("Result: " + result);
    }

    public static double getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public static String getOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter operation (+, -, *, /): ");
        return scanner.nextLine();
    }

    public static double performOperation(double num1, double num2, String operation) {
        switch (operation) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            default:
                System.out.println("Invalid operation.");
                return 0;
        }
    }
}
