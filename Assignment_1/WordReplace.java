import java.util.Scanner;

public class WordReplace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.print("Enter the word to replace: ");
        String wordToReplace = scanner.next();
        System.out.print("Enter the word to replace with: ");
        String replacementWord = scanner.next();
        
        sentence = sentence.replace(wordToReplace, replacementWord);
        System.out.println("Modified Sentence: " + sentence);
    }
}
