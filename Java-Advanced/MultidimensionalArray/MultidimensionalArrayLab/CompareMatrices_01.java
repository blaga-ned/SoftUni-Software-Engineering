package MultidimensionalArray.MultidimensionalArrayLab;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstMatrixSize = scanner.nextLine().split("\\s+");
        int firstMatrixRows = Integer.parseInt(firstMatrixSize[0]);
        int firstMatrixCols = Integer.parseInt(firstMatrixSize[1]);

        int[][] firstMatrix = new int[firstMatrixRows][firstMatrixCols];
        for (int row = 0; row < firstMatrixRows; row++) {
            int[] rowData = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            firstMatrix[row] = rowData;
        }
        String[] secondMatrixSize = scanner.nextLine().split("\\s+");
        int secondMatrixRow = Integer.parseInt(secondMatrixSize[0]);
        int secondMatrixCols = Integer.parseInt(secondMatrixSize[1]);

        if (firstMatrixRows != secondMatrixRow || firstMatrixCols != secondMatrixCols){
            System.out.println("not equal");
            return;
        }

        int[][] secondMatrix = new int[secondMatrixRow][secondMatrixCols];
        for (int row = 0; row < secondMatrixRow; row++) {
            int[] rowData = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            secondMatrix[row] = rowData;
        }
        for (int row = 0; row < firstMatrixRows; row++) {
            for (int col = 0; col < firstMatrixCols; col++) {
                if (firstMatrix[row][col]
                        != secondMatrix[row][col]){
                    System.out.println("not equal");
                    return;
                }
            }
        }
        System.out.println("equal");

    }
}
