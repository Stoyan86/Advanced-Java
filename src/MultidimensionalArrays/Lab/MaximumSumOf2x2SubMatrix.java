package MultidimensionalArrays.Lab;

import java.util.Scanner;

public class MaximumSumOf2x2SubMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            String[] inputTokens = scanner.nextLine().split(", ");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(inputTokens[col]);
            }
        }
        int maxSum = matrix[0][0];
        int maxMatrixRow = 0;
        int maxMatrixCol = 0;
        for (int row = 0; row < rows - 1; row++) {
            for (int col = 0; col < cols - 1; col++) {
                int sum = matrix[row][col] + matrix[row + 1][col] + matrix[row][col + 1] + matrix[row + 1][col + 1];
                if (sum > maxSum) {
                    maxSum = sum;
                    maxMatrixRow = row;
                    maxMatrixCol = col;
                }
            }
        }
        System.out.println(matrix[maxMatrixRow][maxMatrixCol] + " " + matrix[maxMatrixRow][maxMatrixCol+1]);
        System.out.println(matrix[maxMatrixRow+1][maxMatrixCol] + " " + matrix[maxMatrixRow+1][maxMatrixCol+1]);
        System.out.println(maxSum);
    }
}
