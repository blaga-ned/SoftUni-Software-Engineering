package LoopsForWhileAndNested_3.NestedLoopsLab_7;

import java.util.Scanner;

public class MultiplicationTable_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int first = 1; first <= 10 ; first++) {
            for (int second = 1; second <= 10 ; second++) {
                int result = first * second;
                System.out.println(first + " * " + second + " = " + result);

            }

        }
    }
}
