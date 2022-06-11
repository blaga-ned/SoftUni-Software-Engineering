package LoopsForWhileAndNested_3.ForLoopLab_1;

import java.util.Scanner;

public class EvenPowersOf2_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int step = 0; step <= n; step += 2){
            System.out.printf("%.0f%n",Math.pow(2,step));
        }

    }
}
