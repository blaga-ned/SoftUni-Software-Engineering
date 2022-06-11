package ConditionalStatements_2.ConditonalStatementsMoreExercises_05;

import java.util.Scanner;

public class TransportPrice_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nKm = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        double price = 0;

        if (nKm >= 100){
            price = nKm * 0.06;
        }else if (nKm >= 20 ){
            price = nKm * 0.09;
        }else if (nKm < 20){
            if (input.equals("day")){
                price = (nKm * 0.79) + 0.70;
            }else if (input.equals("night")){
                price = (nKm * 0.90) + 0.70;
            }

        }
        System.out.printf("%.2f",price);

    }
}
