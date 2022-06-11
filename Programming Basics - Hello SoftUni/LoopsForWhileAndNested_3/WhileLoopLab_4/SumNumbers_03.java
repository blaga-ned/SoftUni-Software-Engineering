package LoopsForWhileAndNested_3.WhileLoopLab_4;

import java.util.Scanner;

public class SumNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int targetSum = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while (sum<targetSum){
            int number = Integer.parseInt(scanner.nextLine());
            sum+=number;
        }
        System.out.println(sum);
    }
}
