import java.util.Scanner;

public class RemoveDuplicates {
    public static String removeDuplicates(String str) {
        String result = "";
        for (char c : str.toCharArray()) {
            if (result.indexOf(c) == -1) result += c;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(removeDuplicates(str));
    }
}
