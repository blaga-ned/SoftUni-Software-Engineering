package LoopsForWhileAndNested_3.WhileLoopExercise_5;

import java.util.Scanner;

public class Cake_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int cakeSize = width*length;
        String input = scanner.nextLine();

        while (!input.equals("STOP")){
            int pieces = Integer.parseInt(input);

            cakeSize-=pieces;
            if (cakeSize<=0){
                break;
            }

            input = scanner.nextLine();

        }
        if (cakeSize<=0){
            System.out.printf("No more cake left! You need %d pieces more." , Math.abs(cakeSize));
        }else{
            System.out.printf("%d pieces are left.", cakeSize);
        }

    }
}
