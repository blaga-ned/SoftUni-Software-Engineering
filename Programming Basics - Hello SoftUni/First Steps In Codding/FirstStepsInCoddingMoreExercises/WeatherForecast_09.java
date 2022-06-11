package FirstStepsInCodding_1.FirstStepsInCoddingMoreExercises;

import java.util.Scanner;

public class WeatherForecast_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();


        if (text.equals("sunny")) {
            System.out.println("It's warm outside!");
        } else  {
            System.out.println("It's cold outside!");

        }

    }
}
