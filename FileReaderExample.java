import java.io.*; 
 
public class FileReaderExample { 
    public static void main(String[] args) { 
        String filePath = "example.txt"; // Change this to your file path 
        
        try (FileReader fileReader = new FileReader(filePath); 
             BufferedReader bufferedReader = new BufferedReader(fileReader)) { 
 
            String line; 
            while ((line = bufferedReader.readLine()) != null) { 
                System.out.println(line); 
            } 
 
        } catch (FileNotFoundException e) { 
            System.out.println("File not found: " + filePath); 
        } catch (IOException e) { 
            System.out.println("Error reading the file: " + e.getMessage()); 
        } 
    } 
}