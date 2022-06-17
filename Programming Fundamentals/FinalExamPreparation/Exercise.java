package FinalExamPreparation;

import java.util.*;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder messasgeString = new StringBuilder(scanner.nextLine());
        String command = scanner.nextLine();
        while (!command.equals("Reveal")) {
            String[] splitCommand = command.split(":\\|:");
            String commandName = splitCommand[0];
            switch (commandName) {

                case "InsertSpace":
                    int index = Integer.parseInt(splitCommand[1]);
                    messasgeString = messasgeString.insert(index, " ");
                    System.out.println(messasgeString);
                    break;

                case "Reverse":
                    StringBuilder substringToReverse = new StringBuilder(splitCommand[1]);
                    if (messasgeString.toString().contains(substringToReverse)) {
                        messasgeString = new StringBuilder(messasgeString.toString().replaceFirst(substringToReverse.toString(), ""));
                        String reversedSubstring = substringToReverse.reverse().toString();
                        messasgeString.append(reversedSubstring);
                        System.out.println(messasgeString);
                    } else {
                        System.out.println("error");
                    }
                    break;

                case "ChangeAll":
                    String substringToChange = splitCommand[1];
                    String replacement = splitCommand[2];
                    messasgeString = new StringBuilder(messasgeString.toString().replaceAll(substringToChange, replacement));
                    System.out.println(messasgeString);
                    break;

            }

            command = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s", messasgeString);

    }
}





