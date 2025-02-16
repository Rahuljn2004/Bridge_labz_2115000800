import java.util.*; 
public class ConcatenateString { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the size of String array: "); 
        int size = sc.nextInt(); 
        sc.nextLine(); 
        String[] strings = new String[size]; 
        System.out.println("Enter the string elements of array: "); 
        for(int i=0;i<size;i++){ 
            strings[i] = sc.nextLine(); 
        } 
        System.out.println("=====Input Done========"); 
        StringBuffer sf = new StringBuffer(); 
        for(String el : strings){ 
            sf.append(el+" "); 
        } 
        System.out.println("Concatenated string is: "+sf); 
        
 
    } 
} 