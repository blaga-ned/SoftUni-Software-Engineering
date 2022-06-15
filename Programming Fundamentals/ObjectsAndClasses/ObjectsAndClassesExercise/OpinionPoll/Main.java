package ObjectsAndClassesExercise.OpinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> listOfPeople = new ArrayList<>();
        int lines = Integer.parseInt(scanner.nextLine()); //бр.редове
        for (int line = 1; line <= lines; line++) {
            String personalInformation = scanner.nextLine();
            //"Peter 12".split(" ") -> ["Peter", "12"]
            String name = personalInformation.split(" ")[0];
            int age = Integer.parseInt(personalInformation.split(" ")[1]);
            Person person = new Person(name, age);
            //проверка ако възрастта > 30
            if (age > 30) {
                listOfPeople.add(person);
            }
        }
        //списък с хората над 30
        //сортиране по име на хората в списъка
        listOfPeople.sort(Comparator.comparing(Person::getName));

        for (Person person : listOfPeople) {
            //{name} - {age}
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}
