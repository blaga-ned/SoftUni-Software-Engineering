package ObjectsAndClassesExercise.OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String personalInformation = scanner.nextLine();
        List<Person> listOfPeople = new ArrayList<>();
        while(!personalInformation.equals("End")) {
            //"George 123456 20".split(" ") -> ["George", "123456", "20"]
            String name = personalInformation.split(" ")[0];
            String id = personalInformation.split(" ")[1];
            int age = Integer.parseInt(personalInformation.split(" ")[2]);

            Person person = new Person(name, id, age);
            listOfPeople.add(person);

            personalInformation = scanner.nextLine();
        }

        //списък с хората
        //сортиране по възраст в нарастващ ред (ascending order)
        listOfPeople.sort(Comparator.comparing(Person::getAge));

        for (Person person : listOfPeople) {
            System.out.println(person.toString());
        }

    }
}
