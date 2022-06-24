package MultidimensionalArray.MultidimensionalArrayExercise;

import java.util.Scanner;

public class ReverseMatrixDiagonals_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] matrixSize = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(matrixSize[0]);
        int cols = Integer.parseInt(matrixSize[1]);

        String[][] matrix = new String[rows][cols];
        fillMatrix(matrix, rows, cols, scanner);

        int row = rows - 1;
        int col = cols - 1;
        while (row != - 1) {
            int r = row;
            int c = col;
            while (c < cols && r >= 0){
                System.out.print(matrix[r--][c++] + " ");
            }
            System.out.println();
            col--;
            if(col == -1){
                col = 0;
                row--;
            }
        }
    }
    private static boolean isValid(int r, int c, String[][] matrix) {
        return (r < 0 || c < 0 || r > matrix.length || c > matrix[0].length - 1);
    }

    private static void fillMatrix(String[][] matrix, int rows, int cols, Scanner scanner) {
        for (int row = 0; row < rows; row++) {
            String[] matrixData = scanner.nextLine().split("\\s+");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = matrixData[col];
            }
        }
    }
}
