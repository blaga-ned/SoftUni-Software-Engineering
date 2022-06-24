package MultidimensionalArray.MultidimensionalArrayLab;

import java.util.Scanner;

public class MaximumSumOf2x2SubMatrix_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(tokens[0]);
        int cols = Integer.parseInt(tokens[1]);

        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            String[] matrixData = scanner.nextLine().split(", ");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(matrixData[col]);
            }
        }

        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        int number4 = 0;
        for (int row = 0; row < rows - 1; row++) {
            for (int col = 0; col < cols - 1; col++) {
                sum = matrix[row][col] + matrix[row][col + 1]
                        + matrix[row + 1][col] + matrix[row + 1][col + 1];
                if (sum > maxSum) {
                    maxSum = sum;
                    number1 = matrix[row][col];
                    number2 = matrix[row][col+1];
                    number3 = matrix[row+1][col];
                    number4 = matrix[row+1][col+1];
                }
            }
        }
        System.out.println(number1 + " " + number2);
        System.out.println(number3 + " " + number4);
        System.out.println(maxSum);

    }
}
