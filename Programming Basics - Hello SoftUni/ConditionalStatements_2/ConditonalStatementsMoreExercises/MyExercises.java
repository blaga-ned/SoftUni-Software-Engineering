package ConditionalStatements_2.ConditonalStatementsMoreExercises_05;

import java.util.Scanner;

public class MyExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int neededHours = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int employees = Integer.parseInt(scanner.nextLine());

        double minusTraining = days-(days*0.1);
        double hours = minusTraining*8;
        double extraHours = Math.floor(employees*(days*2));
        double allHour = Math.floor(days+extraHours);

        double left = 0.0;
        double need = 0.0;

        if (neededHours <= allHour) {
            left = allHour - neededHours;
            System.out.printf("Yes!%s hours left.", left);
        } else {
            need = neededHours - allHour;
            System.out.printf("Not enough time!%s hours needed.", need);
        }


    }
}
