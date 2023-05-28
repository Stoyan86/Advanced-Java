package MultidimensionalArrays.Exersices;

import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        String [][] matrix = new String[rows][cols];
        fillMatrix(rows, cols, matrix);
        printMatrix(matrix);

    }
    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void fillMatrix(int rows, int cols, String[][] matrix) {
        int firstLetter= 97;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                StringBuilder element = new StringBuilder();
                element.append((char)(firstLetter + row));
                element.append((char)(firstLetter+col + row));
                element.append((char)(firstLetter + row));
                matrix[row][col] = element.toString();
            }
        }
    }
}
