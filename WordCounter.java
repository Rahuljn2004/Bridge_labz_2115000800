import java.io.*;

public class WordCounter {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java WordCounter <file-path> <word-to-count>");
            return;
        }
        
        String filePath = args[0];
        String targetWord = args[1];
        int wordCount = 0;
        
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split("\\W+"); // Split by non-word characters
                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) { // Case-insensitive comparison
                        wordCount++;
                    }
                }
            }
            
            System.out.println("The word '" + targetWord + "' appears " + wordCount + " times in the file.");
            
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
