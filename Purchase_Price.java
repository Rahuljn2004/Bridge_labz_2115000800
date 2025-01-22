import java.util.Scanner;
class Purchase_Price {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the unit price: ");
        double unit_Price = input.nextDouble();
        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();
        double total_Price = unit_Price * quantity;
        System.out.println("The total purchase price is INR " + total_Price + " if the quantity " + quantity + " and unit price is INR " + unit_Price);
        input.close();
    }
}
