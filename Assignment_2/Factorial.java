import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int number = getInput("Enter a number: ");
        System.out.println("The factorial of " + number + " is: " + calculateFactorial(number));
    }

    public static int getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static int calculateFactorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * calculateFactorial(num - 1);
    }
}
