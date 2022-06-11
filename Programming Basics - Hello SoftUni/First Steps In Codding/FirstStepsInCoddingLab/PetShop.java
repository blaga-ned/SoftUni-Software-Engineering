package FirstStepsInCodding_1.FirstStepsInCodding_01;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogs = Integer.parseInt(scanner.nextLine());
        int animals = Integer.parseInt(scanner.nextLine());
        double result = dogs*2.50 + animals*4;
        System.out.println(result + " lv.");
    }
}
