package SetsAndMapsAdvancedExercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, String> phoneBook = new HashMap<>();
        while (!input.equals("search")){
            String[] data = input.split("-");
            String name = data[0];
            String phoneNumber = data[1];
            phoneBook.put(name, phoneNumber);
            input = scanner.nextLine();
        }
        String text = scanner.nextLine();
        while (!text.equals("stop")){
            if (!phoneBook.containsKey(text)){
                System.out.printf("Contact %s does not exist.%n", text);
            }else{
                System.out.printf("%s -> %s%n", text, phoneBook.get(text));
            }
            text = scanner.nextLine();
        }
    }
}
