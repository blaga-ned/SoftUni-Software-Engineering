package ConditionalStatements_2.ConditonalStatementsMoreExercises_05;

import java.util.Scanner;

public class FlowerShop_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numMagnolias = Integer.parseInt(scanner.nextLine());
        int numHyacinth = Integer.parseInt(scanner.nextLine());
        int numRoses = Integer.parseInt(scanner.nextLine());
        int numCactus = Integer.parseInt(scanner.nextLine());
        double pricePresent = Double.parseDouble(scanner.nextLine());

        double earning = numMagnolias*3.25 + numHyacinth*4 + numRoses*3.5 + numCactus*8;
        double totalEarning = earning * 0.95;

        if (totalEarning >= pricePresent){
            double diff = Math.floor(totalEarning - pricePresent);
            System.out.printf("She is left with %.0f leva.",diff);

        }else{
            double diff = Math.ceil(pricePresent-totalEarning);
            System.out.printf("She will have to borrow %.0f leva.",diff);
        }
    }
}
