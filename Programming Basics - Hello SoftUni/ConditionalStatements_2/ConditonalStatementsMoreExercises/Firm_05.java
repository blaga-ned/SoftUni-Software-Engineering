package ConditionalStatements_2.ConditonalStatementsMoreExercises_05;

import java.util.Scanner;

public class Firm_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int neededHours = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int employees = Integer.parseInt(scanner.nextLine());

        double minusTraining = days - (days * 0.1);
        double hours = minusTraining * 8;
        double extraHours = Math.floor(employees * (days * 2));
        double totalHours = Math.floor(extraHours + hours);

        if (neededHours <= totalHours){
            double diff = totalHours - neededHours;
            System.out.printf("Yes!%.0f hours left.",diff);

        }else{
            double diff = neededHours - totalHours;
            System.out.printf("Not enough time!%.0f hours needed.", diff);

        }

    }
}
