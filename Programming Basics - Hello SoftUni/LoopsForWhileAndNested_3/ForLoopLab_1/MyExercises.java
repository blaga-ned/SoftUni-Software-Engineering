package LoopsForWhileAndNested_3.ForLoopLab_1;

import java.util.Scanner;

public class MyExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int leftSum = 0;
        int rightSum = 0;

        //left sum
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            leftSum += num;
        }
        //right sum
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            rightSum += num;
        }

        if (leftSum == rightSum) {
            System.out.printf("Yes, sum = %d", leftSum);
        } else {
            System.out.printf("No, diff = %d", Math.abs(leftSum - rightSum));
        }


    }
}
