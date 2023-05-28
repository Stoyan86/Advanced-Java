package MultidimensionalArrays.Exersices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RallyRacing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthMatrix = Integer.parseInt(scanner.nextLine());
        String carNumber = scanner.nextLine();
        String[][] matrix = new String[lengthMatrix][lengthMatrix];
        fillMatrix(matrix, scanner);
        int currentRow = 0;
        int currentCol = 0;
        int currentKm = 0;
        List<Integer> tunnelsCoordinates = new ArrayList<>();
        findTunnels(matrix, tunnelsCoordinates);
        String direction = scanner.nextLine();
        while (!direction.equals("End")) {
            switch (direction) {
                case "left":
                    currentCol--;
                    break;
                case "right":
                    currentCol++;
                    break;
                case "up":
                    currentRow--;
                    break;
                case "down":
                    currentRow++;
                    break;
            }
            String movedPlace = matrix[currentRow][currentCol];
            switch (movedPlace) {
                case ".":
                    currentKm += 10;
                    break;
                case "F":
                    currentKm += 10;
                    matrix[currentRow][currentCol] = "C";
                    System.out.printf("Racing car %s finished the stage!%n", carNumber);
                    System.out.printf("Distance covered %d km.%n", currentKm);
                    printMatrix(matrix);
                    return;
                case "T":
                    currentRow = tunnelsCoordinates.get(2);
                    currentCol = tunnelsCoordinates.get(3);
                    currentKm += 30;
                    matrix[tunnelsCoordinates.get(0)][tunnelsCoordinates.get(1)] = ".";
                    matrix[tunnelsCoordinates.get(2)][tunnelsCoordinates.get(3)] = ".";
            }
            direction = scanner.nextLine();
        }
        matrix[currentRow][currentCol] = "C";
        System.out.printf("Racing car %s DNF.%n", carNumber);
        System.out.printf("Distance covered %d km. %n", currentKm);
        printMatrix(matrix);
    }

    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }


    private static void findTunnels(String[][] matrix, List<Integer> tunnelsCoordinates) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col].equals("T")) {
                    tunnelsCoordinates.add(row);
                    tunnelsCoordinates.add(col);
                }
            }
        }
    }

    private static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("\\s++");
        }
    }
}
