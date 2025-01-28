import java.util.Scanner;

public class Simple_Interest{
	int simpleIntrest =0;
	
	public void simpleIntrest(int Principal ,int Rate , int Time_values){
		
		simpleIntrest = (Principal*Rate*Time_values)/100;
		
		System.out.println("The Simple Interest is "+ simpleIntrest +"for Principal"+ Principal +"Rate of Interest "+ Rate +"and Time" +Time_values);
	}
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the Principal");
		int Principal = input.nextInt();
		
		System.out.println("enter the Rate");
		int Rate = input.nextInt();
		
		System.out.println("enter the Time_values");
		int Time_values= input.nextInt();
		
		Simple_Interest object = new Simple_Interest();
		object.simpleIntrest(Principal , Rate , Time_values);
	}
}