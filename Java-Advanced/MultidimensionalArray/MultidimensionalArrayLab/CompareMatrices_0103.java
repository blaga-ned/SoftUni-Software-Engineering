package MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices_0103 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrayOneSize = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int rowsMatrixOne = arrayOneSize[0];
        int colsMatrixOne = arrayOneSize[1];

        int[][] matrixOne = new int[rowsMatrixOne][colsMatrixOne];

        for (int i = 0; i < rowsMatrixOne; i++) {
            int[] currentRow = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            matrixOne[i] = currentRow;
        }

        int[] arrayTwoSize = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int rowsMatrixTwo = arrayTwoSize[0];
        int colsMatrixTwo = arrayTwoSize[1];

        int[][] matrixTwo = new int[rowsMatrixTwo][colsMatrixTwo];

        for (int i = 0; i < rowsMatrixTwo; i++) {
            int[] currentRow = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            matrixTwo[i] = currentRow;
        }

        boolean areEqual = matrixOne.length == matrixTwo.length
                && areArraysAreEqual(matrixOne, matrixTwo);
        System.out.println(areEqual ? "equal" : "not equal");

    }

    private static boolean areArraysAreEqual(int[][] matrixOne, int[][] matrixTwo) {
        if (matrixOne.length != matrixTwo.length) {
            return false;
        }
        for (int r = 0; r < matrixOne.length; r++) {
            int[] firstArr = matrixOne[r];
            int[] secondArr = matrixTwo[r];
            if (firstArr.length != secondArr.length) {
                return false;
            }
            for (int i = 0; i < firstArr.length; i++) {
                int firstNumber = firstArr[i];
                int secondNumber = secondArr[i];
                if (firstNumber != secondNumber){
                    return false;
                }
            }
        }
        return true;
    }
}
