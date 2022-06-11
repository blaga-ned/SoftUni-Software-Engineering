package FirstStepsInCodding_1.FirstStepsInCodding_01;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //vhod: red 1 - ime, red 2 - chasa
        // needed hours = broi proekti*3
        // izhod

        String name = scanner.nextLine();
        int countProject = Integer.parseInt(scanner.nextLine());
        int neededHour = countProject*3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, neededHour, countProject);
    }
}
