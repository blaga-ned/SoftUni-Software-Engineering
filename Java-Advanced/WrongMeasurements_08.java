package MultidimensionalArraysLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WrongMeasurements_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matrixSize = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[matrixSize][];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = readArray(scanner);
        }

        int[] wrongValueIndexes = readArray(scanner);
        int valueToReplace = matrix[wrongValueIndexes[0]][wrongValueIndexes[1]];
        List<int[]> correctValues = new ArrayList<>();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                int currentElement = matrix[row][col];
                if (currentElement == valueToReplace) {
                    int correctValue = getNearBySum(matrix, row, col, valueToReplace);
                    correctValues.add(new int[]{row, col, correctValue});
                }
            }
        }
        for (int[] correctValue : correctValues) {
            int row = correctValue[0];
            int col = correctValue[1];
            matrix[row][col] = correctValue[2];
        }

        printMatrix(matrix);
    }

    private static int getNearBySum(int[][] matrix, int row, int col, int valueToReplace) {
        int sum = 0;

        if (isInBounds(matrix, row + 1, col) && matrix[row + 1][col] != valueToReplace) {
            sum += matrix[row + 1][col];

        }
        if (isInBounds(matrix, row - 1, col) && matrix[row - 1][col] != valueToReplace) {
            sum += matrix[row - 1][col];
        }
        if (isInBounds(matrix, row, col + 1) && matrix[row][col + 1] != valueToReplace) {
            sum += matrix[row][col + 1];
        }
        if (isInBounds(matrix, row, col - 1) && matrix[row][col - 1] != valueToReplace) {
            sum += matrix[row][col - 1];
        }
        return sum;
    }

    private static boolean isInBounds(int[][] matrix, int row, int col) {
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length;
    }

    private static boolean isOutOfBounds(int[][] matrix, int row, int col) {
        return !isInBounds(matrix, row, col);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] arr : matrix) {
            for (int n : arr) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
    }
}
