package ConditionalStatements_2.ConditonalStatementsMoreExercises_05;

import java.util.Scanner;

public class SleepyTomCat_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numDaysOff = Integer.parseInt(scanner.nextLine());

        int daysOff = numDaysOff * 127;
        int daysWork = (365 - numDaysOff) * 63;
        int totalDaysPlay = daysOff + daysWork;
        int totalTime = Math.abs(30000-totalDaysPlay);
        int h = totalTime/60;
        int m = totalTime % 60;


        if (30000 >= totalDaysPlay){
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play",h,m);

        }else{
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play",h,m);

        }
    }
}
