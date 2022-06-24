package MultidimensionalArray.MultidimensionalArrayExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        int [][] matrix = new int[rows][cols];
        fillTheMatrix(matrix, rows, scanner);

        int maxSum = Integer.MIN_VALUE;
        int startRow = 0;
        int startCol = 0;
        for (int row = 0; row < rows - 2; row++) {
            for (int col = 0; col < cols - 2; col++) {
                int sum = matrix[row][col] + matrix[row][col+1] + matrix[row][col+2]
                        + matrix[row+1][col] + matrix[row+1][col+1] + matrix[row+1][col+2]
                        + matrix[row+2][col] + matrix[row+2][col+1] + matrix[row+2][col+2];

                if (sum > maxSum){
                    maxSum = sum;
                    startRow = row;
                    startCol = col;
                }
            }
        }
        System.out.println("Sum = " + maxSum);
        for (int row = startRow; row <= startRow+2; row++) {
            for (int col = startCol; col <= startCol +2 ; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void fillTheMatrix(int[][] matrix, int rows, Scanner scanner) {
        for (int row = 0; row < rows; row++) {
            int[] rowData = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            matrix[row] = rowData;
        }
    }
}
