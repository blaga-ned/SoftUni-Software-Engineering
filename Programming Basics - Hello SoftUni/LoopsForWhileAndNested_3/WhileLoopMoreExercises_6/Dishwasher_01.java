package LoopsForWhileAndNested_3.WhileLoopMoreExercises_6;

import java.util.Scanner;

public class Dishwasher_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int detergent = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int count = 0;
        int countPlates = 0;
        int countPots = 0;
        int totalWashigUpLiquid = detergent*750;
        boolean notEnough = false;

        while (!input.equals("End")){
            int quantity = Integer.parseInt(input);
            count++;

            if (count % 3 == 0){
                totalWashigUpLiquid = totalWashigUpLiquid - (quantity*15);
                countPots+=quantity;

            }else{
                totalWashigUpLiquid = totalWashigUpLiquid - (quantity*5);
                countPlates+=quantity;
            }
            if (totalWashigUpLiquid<0){
                notEnough = true;
                break;
            }

            input = scanner.nextLine();
        }
        if (notEnough){
            System.out.printf("Not enough detergent, %d ml. more necessary!",Math.abs(totalWashigUpLiquid));
        }else{
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n",countPlates,countPots);
            System.out.printf("Leftover detergent %d ml.",totalWashigUpLiquid);
        }

    }
}
