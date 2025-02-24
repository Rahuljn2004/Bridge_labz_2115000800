
import java.util.regex.*;
import java.util.*;

public class ExtractLanguages {
    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        Pattern pattern = Pattern.compile("\\b(JavaScript|Java|Python|Go)\\b");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}



