import java.util.Scanner;

public class CompareStrings {
    public static String compare(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());
        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) < str2.charAt(i)) return str1 + " comes before " + str2;
            if (str1.charAt(i) > str2.charAt(i)) return str2 + " comes before " + str1;
        }
        return str1.length() < str2.length() ? str1 + " comes before " + str2 : str2 + " comes before " + str1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(compare(str1, str2));
    }
}
