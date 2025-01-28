import java.util.Scanner;

public class UnitConvertor {

    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter yards to convert to feet:");
        double yards = sc.nextDouble();
        System.out.println(yards + " yards is " + convertYardsToFeet(yards) + " feet.");

        System.out.println("Enter feet to convert to yards:");
        double feet = sc.nextDouble();
        System.out.println(feet + " feet is " + convertFeetToYards(feet) + " yards.");

        System.out.println("Enter meters to convert to inches:");
        double meters = sc.nextDouble();
        System.out.println(meters + " meters is " + convertMetersToInches(meters) + " inches.");

        System.out.println("Enter inches to convert to meters:");
        double inches = sc.nextDouble();
        System.out.println(inches + " inches is " + convertInchesToMeters(inches) + " meters.");

        System.out.println("Enter inches to convert to centimeters:");
        inches = sc.nextDouble();
        System.out.println(inches + " inches is " + convertInchesToCentimeters(inches) + " centimeters.");

        sc.close();
    }
}