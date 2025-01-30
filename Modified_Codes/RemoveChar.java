import java.util.Scanner;

public class RemoveChar {
    public static String removeChar(String str, char ch) {
        String result = "";
        for (char c : str.toCharArray()) {
            if (c != ch) result += c;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);
        System.out.println(removeChar(str, ch));
    }
}
