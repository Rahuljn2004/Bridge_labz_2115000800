import java.util.Scanner;

public class EnhancedLargestDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int maxDigits = 10;
        int[] digits = new int[maxDigits];
        int index = 0;

        while (number != 0) {
            if (index == maxDigits) {
                maxDigits += 10;
                int[] temp = new int[maxDigits];
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp;
            }
            digits[index++] = number % 10;
            number /= 10;
        }

        int largest = 0, secondLargest = 0;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);
    }
}
