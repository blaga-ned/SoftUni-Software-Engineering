package FunctionalProgrammingExercise;
import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerPrint_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split("\\s+");
        //nachin 1:
       /* for (String name : names) {
            System.out.println(name);
        }
        //nachin 2:
        //po kratkia nachin na zapis na Consumer
        //Consumer<String> printName = System.out::println;
        Consumer<String> printName = name -> System.out.println(name);
        for (String name : names) {
            printName.accept(name);
        }*/
        //nachin 3:

        Consumer<String[]> printNames = array -> {
            for (String name : names) {
                System.out.println(name);
            }
        };
        printNames.accept(names);
    }
}
