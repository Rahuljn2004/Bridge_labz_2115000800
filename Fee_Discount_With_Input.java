import java.util.Scanner;
class Fee_Discount_With_Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the fee amount: ");
        int fee = input.nextInt();
        System.out.print("Enter the discount percentage: ");
        int discount_Percent = input.nextInt();
        int discount = (fee * discount_Percent) / 100;
        int discounted_Fee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discounted_Fee);
        input.close();
    }
}
