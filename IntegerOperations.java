import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of number1: ");
        int number1 = sc.nextInt();

        System.out.print("Enter the value of number2: ");
        int number2 = sc.nextInt();

        System.out.print("Enter the value of number3: ");
        int number3 = sc.nextInt();

        int result1 = number1 + number2 * number3;
        int result2 = number1 * number2 + number3;
        double result3 = number3 + (double)number1 / number2;
        int result4 = number1 % number2 + number3;

        System.out.println("The results of Integer Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
    }
}
