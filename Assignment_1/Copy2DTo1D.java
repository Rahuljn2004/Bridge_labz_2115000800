import java.util.Scanner;

public class Copy2DTo1D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];
        int[] array = new int[rows * cols];
        int index = 0;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
                array[index++] = matrix[i][j];
            }
        }
        
        System.out.print("1D Array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
