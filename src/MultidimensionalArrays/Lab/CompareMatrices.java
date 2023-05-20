package MultidimensionalArrays.Lab;

import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstMatrixRows = scanner.nextInt();
        int firstMatrixCol = scanner.nextInt();
        int [][] firstMatrix = new int[firstMatrixRows][firstMatrixCol];
        for (int row = 0; row < firstMatrixRows; row++) {
            for (int col = 0; col < firstMatrixCol; col++) {
                firstMatrix[row][col] = scanner.nextInt();
            }
        }
        int secondMatrixRows = scanner.nextInt();
        int secondMatrixCol = scanner.nextInt();
        int [][] secondMatrix = new int [secondMatrixRows][secondMatrixCol];
        for (int row = 0; row < secondMatrixRows; row++) {
            for (int col = 0; col < secondMatrixCol; col++) {
                secondMatrix[row][col] = scanner.nextInt();
            }
        }
        if (firstMatrixRows != secondMatrixRows || firstMatrixCol != secondMatrixCol){
            System.out.println("not equal");
            return;
        }
        for (int row = 0; row < firstMatrixRows; row++) {
            for (int col = 0; col < firstMatrixCol; col++) {
                if (firstMatrix[row][col] != secondMatrix[row][col]){
                    System.out.println("not equal");
                    return;
                }
            }
        }
        System.out.println("equal");
    }
}
