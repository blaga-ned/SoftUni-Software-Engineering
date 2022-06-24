package MultidimensionalArray.MultidimensionalArrayExercise;

import java.util.ArrayList;
import java.util.Scanner;

public class StringMatrixRotation_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rotation = scanner.nextLine();
        int angleRotation = Integer.parseInt(rotation.split("[()]+")[1]) % 360;
        ArrayList<String> linesOfMatrix = new ArrayList<>();
        int maxLength = 0;
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("END")) {
                break;
            }
            linesOfMatrix.add(line);
            if (line.length() > maxLength) {
                maxLength = line.length();
            }
        }
        int rows = linesOfMatrix.size();
        int cols = maxLength;
        char[][] matrix = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (col < linesOfMatrix.get(row).length()) {
                    matrix[row][col] = linesOfMatrix.get(row).charAt(col);
                } else {
                    matrix[row][col] = ' ';
                }
            }
        }
        rotate(angleRotation, matrix, cols, rows);
    }
    private static void rotate(int angleRotation, char[][] matrix, int cols, int rows) {
        if (angleRotation == 90) {
            for (int col = 0; col < cols ; col++) {
                for (int row = rows - 1; row >= 0 ; row--) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }

        } else if (angleRotation == 180) {
            for (int row = rows - 1; row >= 0; row--) {
                for (int col = cols - 1; col >= 0; col--) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }

        } else if (angleRotation == 270) {
            for (int col = cols - 1; col >= 0; col--) {
                for (int row = 0; row < rows; row++) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }

        }else{
            for (int row = 0; row < rows ; row++) {
                for (int col = 0; col < cols ; col++) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }
        }
    }
}
