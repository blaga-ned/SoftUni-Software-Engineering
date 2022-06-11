package ConditionalStatements_2.ConditonalStatementsMoreExercises_05;

import java.util.Scanner;

public class FuelTank_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        double oilLitres = Double.parseDouble(scanner.nextLine());

        if (text.equals("Diesel")){
            if (oilLitres >= 25){
                System.out.println("You have enough diesel.");
            }else{
                System.out.println("Fill your tank with diesel!");
            }

        }else if (text.equals("Gasoline")){
            if (oilLitres >= 25){
                System.out.println("You have enough gasoline.");
            }else{
                System.out.println("Fill your tank with gasoline!");
            }

        }else if (text.equals("Gas")){
            if (oilLitres >= 25){
                System.out.println("You have enough gas.");
            }else{
                System.out.println("Fill your tank with gas!");
            }

        }else{
            System.out.println("Invalid fuel!");
        }

    }
}
