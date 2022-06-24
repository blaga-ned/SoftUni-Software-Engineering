package FunctionalProgrammingLab;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilterByAge_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> people = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] personData = scanner.nextLine().split(", ");
            String personName = personData[0];
            int personAge = Integer.parseInt(personData[1]);
            people.put(personName, personAge);
        }
        String comparison = scanner.nextLine();
        int ageLimit = Integer.parseInt(scanner.nextLine());
        String printType = scanner.nextLine();


        //Predicate
        BiPredicate<Integer, Integer> filterPredicate;
        if (comparison.equals("younger")) {
            filterPredicate = (personAge, age) -> personAge <= age;
        } else {
            filterPredicate = (personAge, age) -> personAge >= age;
        }

        //Consumer
        Consumer<Map.Entry<String, Integer>> printConsumer;
        if (printType.equals("age")) {
            printConsumer = person -> System.out.println(person.getValue());
        } else if (printType.equals("name")) {
            printConsumer = person -> System.out.println(person.getKey());
        } else {
            printConsumer = person -> System.out.printf("%s - %d%n", person.getKey(), person.getValue());
        }
        Predicate<Map.Entry<String, Integer>> finalPredicate = person -> filterPredicate.test(person.getValue(), ageLimit);

        people.entrySet()
                .stream()
                .filter(finalPredicate)
                .forEach(printConsumer);
    }
}
