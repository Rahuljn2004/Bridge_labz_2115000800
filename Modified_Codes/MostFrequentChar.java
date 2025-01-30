import java.util.Scanner;

public class MostFrequentChar {
    public static char mostFrequentChar(String str) {
        int maxCount = 0;
        char maxChar = ' ';
        for (char c : str.toCharArray()) {
            int count = 0;
            for (char ch : str.toCharArray()) {
                if (c == ch) count++;
            }
            if (count > maxCount) {
                maxCount = count;
                maxChar = c;
            }
        }
        return maxChar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Most Frequent Character: " + mostFrequentChar(str));
    }
}
