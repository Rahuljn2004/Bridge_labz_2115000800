import java.util.Scanner;

public class BMICalculator2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();

        double[][] personData = new double[numberOfPersons][3]; // 0: Height, 1: Weight, 2: BMI
        String[] weightStatus = new String[numberOfPersons];

        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");

            do {
                System.out.print("Height (in meters, positive value): ");
                personData[i][0] = scanner.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Height must be positive. Please try again.");
                }
            } while (personData[i][0] <= 0);

            do {
                System.out.print("Weight (in kilograms, positive value): ");
                personData[i][1] = scanner.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Weight must be positive. Please try again.");
                }
            } while (personData[i][1] <= 0);

            // Calculate BMI and store in the 2D array
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);

            // Determine weight status
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\nBMI Details:");
        System.out.println("Person\tHeight\tWeight\tBMI\t\tStatus");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%d\t%.2f\t%.2f\t%.2f\t%s\n",
                    i + 1, personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
    }
}
