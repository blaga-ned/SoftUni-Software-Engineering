package ConditionalStatements_2.ConditionalStatementsAdvancedExercises_04;

import java.util.Scanner;

public class OnTimeForTheExam_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());

        int arriveHour = Integer.parseInt(scanner.nextLine());
        int arriveMinutes = Integer.parseInt(scanner.nextLine());

        int examTime = examHour * 60 + examMinutes;
        int arrivedTime = arriveHour * 60 + arriveMinutes;

        String output1 = "";
        String output2 = "";

        if (examTime >= arrivedTime && arrivedTime >= examTime - 30) {
            output1 = "On time";
            int diff = examTime - arrivedTime;
            if (diff < 60){
                output2 = String.format("%d minutes before the start",diff);

            }

        } else if (arrivedTime < examTime - 30) {
            output1 = "Early";
            int diff = examTime - arrivedTime;
            if (diff < 60){
                output2 = String.format("%d minutes before the start",diff);
            }else{
                int hour = diff / 60;
                int min = diff % 60;
                output2 = String.format("%d:%02d hours before the start",hour,min);

            }

        } else if (arrivedTime > examTime) {
            output1 = "Late";

            int diff = arrivedTime - examTime;
            if (diff < 60){
                output2 = String.format("%d minutes after the start",diff);
            }else{
                int hour = diff / 60;
                int min = diff % 60;
                output2 = String.format("%d:%02d hours after the start",hour,min);

            }

        }
        System.out.println(output1);
        System.out.println(output2);
    }
}
