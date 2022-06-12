package DataTypesAndVariables.DataTypesAndVariablesLab;

import java.util.Scanner;

public class RefactorSpecialNumbers_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sumDigits = 0;
        int savedNum = 0;
        for (int i = 1; i <= n; i++) {
            savedNum = i;
            while (i > 0) {
                sumDigits += i % 10;
                i = i / 10;
            }
            if (sumDigits == 5 || sumDigits == 7 || sumDigits == 11){
                System.out.printf("%d -> %b%n", savedNum,sumDigits );
                sumDigits = 0;
                i = savedNum;

            }

        }

    }
}
