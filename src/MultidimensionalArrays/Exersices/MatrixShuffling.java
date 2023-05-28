package MultidimensionalArrays.Exersices;


import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dimensional = scanner.nextLine();
        int rows = Integer.parseInt(dimensional.split("\\s++")[0]);
        int cols =  Integer.parseInt(dimensional.split("\\s++")[1]);
        String [][] matrix = new String[rows][cols];
        fillMatrix(matrix, scanner);
        String command = scanner.nextLine();
        while (!command.equals("END")){
            if (commandIsValid(command,matrix)){
                String[] commandsParts = command.split("\\s++");
                int row1 = Integer.parseInt(commandsParts[1]);
                int col1 = Integer.parseInt(commandsParts[2]);
                int row2 = Integer.parseInt(commandsParts[3]);
                int col2 = Integer.parseInt(commandsParts[4]);
                String firstElement = matrix[row1][col1];
                String secondElement = matrix[row2][col2];
                matrix[row1][col1] = secondElement;
                matrix[row2][col2] = firstElement;
                printMatrix(matrix);
            } else {
                System.out.println("Invalid input!");
            }
            command = scanner.nextLine();
        }

    }

    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static boolean commandIsValid(String command, String[][] matrix) {
        String[] commandsParts = command.split("\\s+");

        if (!commandsParts[0].equals("swap") || commandsParts.length!=5){
            return false;
        }
        int row1 = Integer.parseInt(commandsParts[1]);
        int col1 = Integer.parseInt(commandsParts[2]);
        int row2 = Integer.parseInt(commandsParts[3]);
        int col2 = Integer.parseInt(commandsParts[4]);
        if (row1 < 0 || row1 > matrix.length) {
            return false;
        }
        if (row2 < 0 || row2 > matrix.length) {
            return false;
        }
        if (col1 < 0 || col1 > matrix[0].length){
            return false;
        }

        if (col2 < 0 || col2 > matrix[0].length){
            return false;
        }
        return true;
    }

    private static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row]=scanner.nextLine().split("\\s++");
        }
    }
}
