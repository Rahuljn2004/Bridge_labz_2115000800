import java.util.Scanner;

public class TriangularPark {
    
    public static double calculateRounds(int a, int b, int c, int distance){
        int perimeter = a + b + c;

        double rounds =  ((double) distance * 1000) / perimeter;
        return rounds;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three sides of a Triangle in meters:::");
        System.out.println("Enter the value of side 1");
        int side1 = sc.nextInt();
        System.out.println("Enter the value of side 2");
        int side2 = sc.nextInt();
        System.out.println("Enter the value of side 3");
        int side3 = sc.nextInt();
        int distance = 5;
        double rounds = calculateRounds(side1, side2, side3, distance);
        System.out.println("Number of rounds required to complete the 5km run of a Triangular park with the sides\n "+side1+","+side2+","+side3+" is: "+rounds);
        sc.close();
    }
    
}