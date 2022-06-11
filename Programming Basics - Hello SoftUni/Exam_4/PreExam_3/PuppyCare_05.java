package Exam_4.PreExam_3;

import java.util.Scanner;

public class PuppyCare_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int foodKg = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int foodGr = foodKg*1000;
        int totalFood = 0;

        while (!input.equals("Adopted")){
            int foodEat = Integer.parseInt(input);

            totalFood+=foodEat;



            input = scanner.nextLine();
        }
        if (totalFood <= foodGr){
            int diff = 0;
            diff = foodGr - totalFood;
            System.out.printf("Food is enough! Leftovers: %d grams.", diff);

        }else{
            int diff = totalFood - foodGr;
            System.out.printf("Food is not enough. You need %d grams more.", diff);

        }


    }
}
