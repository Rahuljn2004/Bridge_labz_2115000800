import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        for (int number : numbers) {
            if (number > 0) {
                if (number % 2 == 0) {
                    System.out.println(number + " is positive and even.");
                } else {
                    System.out.println(number + " is positive and odd.");
                }
            } else if (number < 0) {
                System.out.println(number + " is negative.");
            } else {
                System.out.println("Zero");
            }
        }
        
        if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println("First and last numbers are equal.");
        } else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("First number is greater.");
        } else {
            System.out.println("Last number is greater.");
        }
    }
}
