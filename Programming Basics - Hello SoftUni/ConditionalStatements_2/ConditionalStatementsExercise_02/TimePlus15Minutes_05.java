package ConditionalStatements_2.ConditionalStatementsExercise_02;

import java.util.Scanner;

public class TimePlus15Minutes_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalMinutes = (hour * 60) + minutes + 15;
        int newHours = totalMinutes / 60;
        int newMinutes = totalMinutes % 60;

        if (newHours<24){
            System.out.printf("%d:%02d", newHours,newMinutes);
        }else{
            newHours=0;
            System.out.printf("%d:%02d", newHours,newMinutes);
        }



    }
}
