package LoopsForWhileAndNested_3.ForLoopExercise_2;

import java.util.Scanner;

public class HalfSumElement_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int maxNum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum = sum + number;
            if (number>maxNum){
                maxNum = number;
            }
        }
        int numMinusMaxNum = sum - maxNum;
        if (maxNum == numMinusMaxNum){
            System.out.println("Yes");
            System.out.printf("Sum = %d" , maxNum);
        }else{

            int diff = Math.abs(maxNum-numMinusMaxNum);
            System.out.println("No");
            System.out.printf("Diff = %d",diff);
        }
    }
}
