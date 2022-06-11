package FirstStepsInCodding_1.FirstStepsInCoddingExercise;

import java.util.Scanner;

public class VacationBookList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int totalReadingTime = countPages/pagesPerHour;
        int hourPerDay = totalReadingTime/days;
        System.out.println(hourPerDay);





    }
}
