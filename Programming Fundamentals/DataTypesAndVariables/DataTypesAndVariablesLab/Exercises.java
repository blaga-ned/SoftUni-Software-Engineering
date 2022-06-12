package DataTypesAndVariables.DataTypesAndVariablesLab;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfCenturies = Integer.parseInt(scanner.nextLine());

        double years = numOfCenturies * 100;
        double days = years * 365.2422;
        double hours = days * 24;
        double minutes = hours * 60;

        System.out.printf("%d centuries = %.0f years = %.0f days = %.0f hours = %.0f minutes"
        , numOfCenturies, years, days, hours, minutes);

    }
}
