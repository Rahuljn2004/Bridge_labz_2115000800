import java.util.Scanner;
class Height_Conversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your height in cm: ");
        int height_Cm = input.nextInt();
        int height_Feet = (int) (height_Cm / 30.48);
        double height_Inches = (height_Cm % 30.48) / 2.54;
        System.out.println("Your Height in cm is " + height_Cm + " while in feet is " + height_Feet + " and inches is " + height_Inches);
        input.close();
    }
}

