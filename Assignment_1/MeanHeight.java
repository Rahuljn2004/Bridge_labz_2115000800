import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] heights = new double[11];
        double total = 0;
        
        for (int i = 0; i < heights.length; i++) {
            heights[i] = scanner.nextDouble();
            total += heights[i];
        }
        
        double mean = total / heights.length;
        System.out.println("Mean Height: " + mean);
    }
}
