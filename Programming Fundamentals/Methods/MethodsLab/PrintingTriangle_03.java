package Methods.MethodsLab;

import java.util.Scanner;

public class PrintingTriangle_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxLineNumber = Integer.parseInt(scanner.nextLine());
        printTriangle(maxLineNumber);
    }
    private static void printTriangle(int maxLineNumber) {
        printTopHalf(maxLineNumber);
        printBottomHalf(maxLineNumber-1);
    }

    private static void printTopHalf(int numberOfRows) {
        for (int i = 1; i <= numberOfRows; i++) {
            printRow(1, i);
            System.out.println();
        }
    }
    private static void printBottomHalf(int longestLine) {
        for (int i = longestLine; i >= 1; i--) {
            printRow(1, i);
            System.out.println();
        }
    }
    private static void printRow(int from, int to) {
        for (int i = from; i <= to; i++) {
            System.out.print(i + " ");

        }
    }
}
