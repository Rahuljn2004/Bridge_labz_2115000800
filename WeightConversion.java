import java.util.Scanner;

public class WeightConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double pounds = input.nextDouble();

        double kilograms = pounds / 2.2;

        System.out.println("The weight of the person in pounds is " + pounds +
                " and in kilograms is " + kilograms);
    }
}
