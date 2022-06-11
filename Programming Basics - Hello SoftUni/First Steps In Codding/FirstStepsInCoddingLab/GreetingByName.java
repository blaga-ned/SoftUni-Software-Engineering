package FirstStepsInCodding_1.FirstStepsInCodding_01;

import java.util.Scanner;

public class GreetingByName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.Ime->konzolata->promenliva
        //2. pechatame "Hello, <name>!"

        String name = scanner.nextLine();
        System.out.println("Hello, " +name+ "!");
    }
}
