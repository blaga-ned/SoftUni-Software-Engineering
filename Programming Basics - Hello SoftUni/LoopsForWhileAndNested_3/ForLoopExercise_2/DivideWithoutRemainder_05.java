package LoopsForWhileAndNested_3.ForLoopExercise_2;

import java.util.Scanner;

public class DivideWithoutRemainder_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            //p1
            if (number % 2 == 0) {
                p1++;
            }
            //p2
            if (number % 3 == 0) {
                p2++;
            }
            //p3
            if (number % 4 == 0) {
                p3++;
            }
        }
        p1 = p1 / n * 100;
        p2 = p2 / n * 100;
        p3 = p3 / n * 100;
        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%n", p3);

    }
}
