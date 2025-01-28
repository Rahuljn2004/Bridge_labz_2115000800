import java.util.Scanner;

public class ArrayInputSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0;
        int index = 0;
        
        while (true) {
            double input = scanner.nextDouble();
            if (input <= 0 || index == numbers.length) {
                break;
            }
            numbers[index++] = input;
        }
        
        for (int i = 0; i < index; i++) {
            total += numbers[i];
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nSum: " + total);
    }
}
