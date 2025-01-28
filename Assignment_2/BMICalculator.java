import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();

        double[] heights = new double[numberOfPersons];
        double[] weights = new double[numberOfPersons];
        double[] bmis = new double[numberOfPersons];
        String[] statuses = new String[numberOfPersons];

        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Height (in meters): ");
            heights[i] = scanner.nextDouble();
            System.out.print("Weight (in kilograms): ");
            weights[i] = scanner.nextDouble();

            bmis[i] = weights[i] / (heights[i] * heights[i]);

            if (bmis[i] <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmis[i] <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmis[i] <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }

        System.out.println("\nBMI Details:");
        System.out.println("Person\tHeight\tWeight\tBMI\t\tStatus");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%d\t%.2f\t%.2f\t%.2f\t%s\n", i + 1, heights[i], weights[i], bmis[i], statuses[i]);
        }
    }
}
