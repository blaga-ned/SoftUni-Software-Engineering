package LoopsForWhileAndNested_3.NestedLoopsLab_7;

import java.util.Scanner;

public class SumOfTwoNumbers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());
        int endNum = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean isFoundCombination = false;

        for (int number1 = startNum; number1 <= endNum; number1++) {
            for (int number2 = startNum; number2 <= endNum; number2++) {
                counter++;

                if (number1 + number2 == magicNum) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, number1, number2, magicNum);
                    isFoundCombination = true;
                    return;
                }

            }

        }
        if (isFoundCombination == false) {
            System.out.printf("%d combinations - neither equals %d", counter, magicNum);

        }

    }
}

