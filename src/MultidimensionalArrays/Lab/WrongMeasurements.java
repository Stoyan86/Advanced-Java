package MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int[][] table = new int[rows][];
        for (int row = 0; row < rows; row++) {
            table[row] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }
        int cols = table[0].length;
        int rowValue = scanner.nextInt();
        int colValue = scanner.nextInt();
        int wrongValue = table[rowValue][colValue];
        //FIXME
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (table[row][col] == wrongValue) {
                    int rowWrongValue = row;
                    int colWrongValue = col;
                    int up, down, left, right = 0;
                    if (rowWrongValue == 0 ) {
                        up = 0;
                    } else {
                        up = table[rowWrongValue - 1][colWrongValue];
                    }
                    if (rowWrongValue == rows - 1) {
                        down = 0;
                    } else {
                        down = table[rowWrongValue + 1][colWrongValue];
                    }
                    if (colWrongValue == 0) {
                        left = 0;
                    } else {
                        left = table[rowWrongValue][colWrongValue - 1];
                    }
                    if (colWrongValue == table[row].length - 1) {
                        right = 0;
                    } else {
                        right = table[rowWrongValue][colWrongValue + 1];
                    }
                    int sum = up + down + left + right;
                    System.out.print(sum + " ");
                } else {
                    System.out.print(table[row][col] + " ");
                }
            }
            System.out.println();
        }
    }
}
