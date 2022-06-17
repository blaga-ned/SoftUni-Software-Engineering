package FinalExamPreparation;

import java.util.Locale;
import java.util.Scanner;

public class ActivationKey_050201 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String activationKey = scanner.nextLine();
        String input = scanner.nextLine();
        while (!input.equals("Generate")) {
            String[] tokens = input.split(">>>");
            String commandName = tokens[0];
            switch (commandName) {
                case "Contains":
                    String substring = tokens[1];
                    if (activationKey.contains(substring)) {
                        System.out.printf("%s contains %s%n", activationKey, substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;

                case "Flip":
                    String UpperLower = tokens[1];
                    int startIndex = Integer.parseInt(tokens[2]);
                    int endIndex = Integer.parseInt(tokens[3]);
                    String substringToReplace = activationKey.substring(startIndex, endIndex);

                    if (UpperLower.equals("Upper")) {
                        activationKey = activationKey.replace(substringToReplace,
                                substringToReplace.toUpperCase(Locale.ROOT));
                    } else {
                        activationKey = activationKey.replace(substringToReplace,
                                substringToReplace.toLowerCase(Locale.ROOT));

                    }
                    System.out.println(activationKey);
                    break;

                case "Slice":
                    int start = Integer.parseInt(tokens[1]);
                    int end = Integer.parseInt(tokens[2]);
                    String substringToRemove = activationKey.substring(start, end);
                    activationKey = activationKey.replace(substringToRemove, "");
                    System.out.println(activationKey);
                    break;

            }

            input = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s", activationKey);
    }
}
