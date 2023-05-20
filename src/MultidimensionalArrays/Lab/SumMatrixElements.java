package MultidimensionalArrays.Lab;

import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        int[][] matrix = new int[rows][cols];
        int sum = 0;
        for (int row = 0; row < rows; row++) {
            String [] inputTokens = scanner.nextLine().split(", ");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(inputTokens[col]);
                sum +=matrix[row][col];
            }
        }
        System.out.printf("%d%n%d%n%d%n", rows, cols, sum);
    }
}
