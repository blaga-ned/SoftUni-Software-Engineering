package DataTypesAndVariables.DataTypesAndVariablesLab;

import java.util.Scanner;

public class SpecialNumbers_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= n; i++) {
            int sumDigit = 0;
            int savedNum = i;
            if (i >= 1 && i <= 9) {
                if (i == 5 || i == 7) {
                    System.out.println(i + " " + "->" + " " + "True");
                } else {
                    System.out.println(i + " " + "->" + " " + "False");
                }
            } else if (i >= 10) {
                while (savedNum != 0) {
                    int lastDigit = savedNum % 10;
                    sumDigit += lastDigit;
                    savedNum = savedNum / 10;

                }
                if (sumDigit == 5 || sumDigit == 7 || sumDigit == 11) {
                    System.out.println(i +" " + "->" + " " + "True");

                } else {
                    System.out.println(i + " " + "->" + " " + "False");
                }

            }

        }

        }

    }

