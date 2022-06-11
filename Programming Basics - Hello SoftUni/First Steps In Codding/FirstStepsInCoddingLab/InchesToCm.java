package FirstStepsInCodding_1.FirstStepsInCodding_01;

import java.util.Scanner;

public class InchesToCm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //inchove->vhod
        //sm = inch*2.54
        //pechatame

        double inches = Double.parseDouble(scanner.nextLine());
        double cm = inches*2.54;
        System.out.println(cm);
    }
}
