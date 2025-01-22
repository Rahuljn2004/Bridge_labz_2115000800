import java.util.Scanner;
class Distance_Conversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        int distance_In_Feet = input.nextInt();
        double distance_In_Yards = distance_In_Feet / 3.0;
        double distance_In_Miles = distance_In_Yards / 1760;
        System.out.println("The distance in yards is " + distance_In_Yards + " and in miles is " + distance_In_Miles);
        input.close();
    }
}
