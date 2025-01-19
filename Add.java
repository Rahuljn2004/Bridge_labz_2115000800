//2. Add Two Numbers 
import java.util.Scanner;
class Add{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your first number");
		int num1 = sc.nextInt();
		System.out.println("enter your second number");
		int num2 = sc.nextInt();
		int sum = num1+num2;
		System.out.println("your sum is "+sum);
		sc.close();
		}
}