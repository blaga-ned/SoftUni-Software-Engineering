package DataTypesAndVariables.DataTypesAndVariablesLab;

import java.util.Scanner;

public class TownInfo_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        int population = Integer.parseInt(scanner.nextLine());
        int squareArea = Integer.parseInt(scanner.nextLine());;

        System.out.printf("Town %s has population of %d and area %d square km.",town,population,squareArea);



    }
}
