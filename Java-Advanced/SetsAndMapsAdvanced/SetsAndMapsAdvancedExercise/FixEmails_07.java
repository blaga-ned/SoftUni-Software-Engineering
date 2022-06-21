package SetsAndMapsAdvanced.SetsAndMapsAdvancedExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, String> map = new LinkedHashMap<>();

        while (!input.equals("stop")){
            String email = scanner.nextLine();
            if (!(email.endsWith("us") || email.endsWith("uk") || email.endsWith("com"))){
                map.put(input, email);
            }
            input = scanner.nextLine();
        }
        map.entrySet().forEach(e -> System.out.printf("%s -> %s%n", e.getKey(), e.getValue()));
    }
}
