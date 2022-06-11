package FirstStepsInCodding_1.FirstStepsInCodding_01;

import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {

        //stranata na kvadrat->vhod->promenliva
        //liceto = strana*strana
        //pechatame liceto
        Scanner scanner = new Scanner(System.in);

        int squareSide = Integer.parseInt(scanner.nextLine());
        int squareArea = squareSide*squareSide;
        System.out.println(squareArea);
    }
}
