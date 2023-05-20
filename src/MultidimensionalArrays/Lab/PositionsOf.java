package MultidimensionalArrays.Lab;

import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        int[][] matrix = new int[rows][cols];
        boolean isFound = false;
        for (int row = 0; row < rows; row++) {
            String[] inputTokens = scanner.nextLine().split("\\s+");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(inputTokens[col]);
            }
        }
        int search = Integer.parseInt(scanner.nextLine());
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (matrix[row][col] == search){
                    System.out.println(row + " " + col);
                    isFound = true;
                }
            }
        }
        if (!isFound){
            System.out.println("not found");
        }
    }
}
