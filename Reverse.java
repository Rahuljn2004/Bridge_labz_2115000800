import java.util.Scanner;

class reverse_String{
    public String reverseString(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your string ");
        String str = input.next();
        reverse_String obj = new reverse_String();
        System.out.println("your reversed string is ");
        System.out.println(obj.reverseString(str));
    }
}
