package LoopsForWhileAndNested_3.WhileLoopExercise_5;

import java.util.Scanner;

public class Walking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int targetSteps = 10000;
        String input = scanner.nextLine();
        int reachedSteps = 0;
        while (!input.equals("Going home")){
            int currentSteps = Integer.parseInt(input);

            reachedSteps+=currentSteps;
            if (reachedSteps >= targetSteps){
                break;
            }

            input = scanner.nextLine();
        }
        if (input.equals("Going home")){
            int homeSteps = Integer.parseInt(scanner.nextLine());
            reachedSteps+=homeSteps;
        }
        int diff = Math.abs(reachedSteps-targetSteps);
        if (reachedSteps>=targetSteps){
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!%n", diff);
        }else{
            System.out.printf("%d more steps to reach goal.",diff);
        }


    }
}
