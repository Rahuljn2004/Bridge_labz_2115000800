import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter the character to remove: ");
        char ch = scanner.next().charAt(0);
        
        str = str.replaceAll(String.valueOf(ch), "");
        System.out.println("Modified String: " + str);
    }
}
