package ConditionalStatements_2.ConditionalStatementsExercise_02;

import java.util.Scanner;

public class BonusScore_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        double bonus = 0;

        if (number<=100){
            bonus = 5;

        }else if (number>1000){
            bonus = number*0.10;

        }else{
            bonus = number*0.20;

        }
        if (number%2==0){
            bonus = bonus+1;
        }else if (number%10==5){
            bonus = bonus+2;
        }
        double sum = bonus+number;
        System.out.printf("%.1f%n%.1f", bonus, sum);


    }
}
