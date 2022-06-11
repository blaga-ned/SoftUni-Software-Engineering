package LoopsForWhileAndNested_3.ForLoopLab_1;

import java.util.Scanner;

public class OddEvenSum_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sumEvenPositions = 0;
        int sumOddPositions = 0;
        for (int number = 1; number <= n; number++){
            int value = Integer.parseInt(scanner.nextLine());
            if (number % 2 ==1){
                sumOddPositions += value;
            }else{
                sumEvenPositions += value;
            }
        }
        if (sumEvenPositions == sumOddPositions){
            System.out.println("Yes");
            System.out.println("Sum = "+ sumEvenPositions);
        }else{
            System.out.println("No");
            System.out.println("Diff = "+ Math.abs(sumEvenPositions - sumOddPositions));
        }

    }
}
