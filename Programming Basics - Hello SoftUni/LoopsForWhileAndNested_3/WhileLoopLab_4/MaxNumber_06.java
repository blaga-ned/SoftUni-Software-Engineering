package LoopsForWhileAndNested_3.WhileLoopLab_4;

import java.util.Scanner;

public class MaxNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int max = Integer.MIN_VALUE;

        while (!input.equals("Stop")){
            int number = Integer.parseInt(input);
            if (number>max){
                max=number;
            }
            input = scanner.nextLine();
        }
        System.out.println(max);
    }
}



