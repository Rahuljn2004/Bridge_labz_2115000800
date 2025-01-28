import java.util.Scanner;

public class Handshakes{
	int Handshakes =0;
	
	public void Max_Handshakes(int Students){
	
		Handshakes= (Students*(Students - 1))/2;
		System.out.println("Maximum number of handshakes are "+Handshakes);
		
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter number of students ");
		int Students = input.nextInt();
		
		Handshakes object = new Handshakes();
		object.Max_Handshakes(Students);
	}
}