import java.util.Scanner; 
public class firstNegative { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the size of the array: "); 
        int n = sc.nextInt(); 
        int arr[] = new int[n]; 
        System.out.println("Enter the elements of the array: "); 

        for(int i=0; i<n;i++){ 
            arr[i] = sc.nextInt(); 
        } 

        for(int i=0;i<n;i++){ 
            if(arr[i]<0){ 
                System.out.println("Index of negative element is: "+i); 
                return; 
            } 
        } 
    }
}