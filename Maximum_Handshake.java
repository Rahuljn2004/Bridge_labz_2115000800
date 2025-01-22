import java.util.Scanner;
class Maximum_Handshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int number_Of_Students = input.nextInt();
        int handshakes = (number_Of_Students * (number_Of_Students - 1)) / 2;
        System.out.println("The maximum number of handshakes is " + handshakes);
        input.close();
    }
}