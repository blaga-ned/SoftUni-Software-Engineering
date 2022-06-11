package ConditionalStatements_2.ConditonalStatementsMoreExercises_05;

import java.util.Scanner;

public class Pets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numDays = Integer.parseInt(scanner.nextLine());
        int foodLeftInKg = Integer.parseInt(scanner.nextLine());
        double foodDogPerDay = Double.parseDouble(scanner.nextLine());
        double foodCatPerDay = Double.parseDouble(scanner.nextLine());
        double foodTurtlePerDay = Double.parseDouble(scanner.nextLine());

        double dogFood = numDays * foodDogPerDay;
        double catFood = numDays * foodCatPerDay;
        double turtleFood = numDays * (foodTurtlePerDay*0.001);
        double totalAnimalFood = dogFood + catFood + turtleFood;

        if (foodLeftInKg >= totalAnimalFood){
            double diff = Math.floor(foodLeftInKg - totalAnimalFood);
            System.out.printf("%.0f kilos of food left.",diff);
        }else{
            double diff = Math.ceil(totalAnimalFood - foodLeftInKg);
            System.out.printf("%.0f more kilos of food are needed.",diff);
        }


    }
}
