package MultidimensionalArrays.Exersices;

import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];
        fillMatrix(rows, cols, matrix, scanner);
        int sumMaxMatrix = Integer.MIN_VALUE;
        int maxMatrixRow = 0;
        int maxMatrixCol = 0;
        for (int row = 0; row < matrix.length - 2; row++) {
            for (int col = 0; col < matrix[row].length - 2; col++) {
                int sum = getSumSquareMatrix(matrix, row, col);
                if (sum > sumMaxMatrix) {
                    sumMaxMatrix = sum;
                    maxMatrixRow = row;
                    maxMatrixCol = col;
                }
            }
        }
        System.out.println("Sum = " + sumMaxMatrix);
        printMaxMatrix(maxMatrixRow, maxMatrixCol, matrix);
    }

    private static void printMaxMatrix(int maxMatrixRow, int maxMatrixCol, int[][] rectMatrix) {
        for (int row = maxMatrixRow; row < maxMatrixRow + 3; row++) {
            for (int col = maxMatrixCol; col < maxMatrixCol + 3; col++) {
                System.out.print(rectMatrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static int getSumSquareMatrix(int[][] matrix, int row, int col) {

        return matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2]
                + matrix[row + 1][col] + matrix[row + 1][col + 1] + matrix[row + 1][col + 2]
                + matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2];
    }

    private static void fillMatrix(int rows, int cols, int[][] rectMatrix, Scanner scanner) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                rectMatrix[row][col] = scanner.nextInt();
            }
        }
    }
}
