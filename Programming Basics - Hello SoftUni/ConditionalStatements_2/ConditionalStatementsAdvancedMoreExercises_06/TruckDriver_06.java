package ConditionalStatements_2.ConditionalStatementsAdvancedMoreExercises_06;

import java.util.Scanner;

public class TruckDriver_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kmPerMonths = Double.parseDouble(scanner.nextLine());

        double salary = 0;

        if (kmPerMonths <= 5000){
            if (season.equals("Spring") || season.equals("Autumn")){
                salary = ((kmPerMonths*0.75)*4)*0.9;
            }else if (season.equals("Summer")){
                salary = ((kmPerMonths*0.90)*4)*0.9;
            }else if (season.equals("Winter")){
                salary = ((kmPerMonths*1.05)*4)*0.9;
            }

        }else if (kmPerMonths > 5000 && kmPerMonths <= 10000){
            if (season.equals("Spring") || season.equals("Autumn")){
                salary = ((kmPerMonths*0.95)*4)*0.9;
            }else if (season.equals("Summer")){
                salary = ((kmPerMonths*1.10)*4)*0.9;
            }else if (season.equals("Winter")){
                salary = ((kmPerMonths*1.25)*4)*0.9;
            }

        }else if (kmPerMonths > 10000 && kmPerMonths <= 20000){
            if (season.equals("Spring") || season.equals("Autumn") ||
            season.equals("Summer") || season.equals("Winter")) {
                salary = ((kmPerMonths * 1.45) * 4) * 0.9;
            }

        }
        System.out.printf("%.2f",salary);
    }
}
