package FinalExamPreparation;

import java.util.Locale;
import java.util.Scanner;

public class NikuldensCharity_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String encrypted = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Finish")) {
            String[] commandParts = command.split(" ");
            String commandName = commandParts[0];

            switch (commandName) {
                case "Replace":
                    char currentChar = commandParts[1].charAt(0);
                    char newChar = commandParts[2].charAt(0);
                    encrypted = encrypted.replace(currentChar, newChar);
                    System.out.println(encrypted);

                    break;
                case "Cut":
                    int StartIndex = Integer.parseInt(commandParts[1]);
                    int EndIndex = Integer.parseInt(commandParts[2]);

                    if (StartIndex < 0 || StartIndex >= encrypted.length() && EndIndex < 0 || EndIndex >= encrypted.length()) {
                        System.out.println("Invalid indexes!");
                    } else {
                        encrypted = encrypted.substring(0, StartIndex) + encrypted.substring(EndIndex + 1, encrypted.length());
                        System.out.println(encrypted);
                    }
                    break;
                case "Make":
                    String upperLower = commandParts[1];
                    if (upperLower.equals("Upper")){
                        encrypted = encrypted.toUpperCase(Locale.ROOT);
                        System.out.println(encrypted);
                    }else if (upperLower.equals("Lower")){
                        encrypted = encrypted.toLowerCase(Locale.ROOT);
                        System.out.println(encrypted);
                    }
                    break;

                case "Check":
                    String stringToCheck = commandParts[1];
                    if (encrypted.contains(stringToCheck)){
                        System.out.println("Message contains " + stringToCheck);
                    }else{
                        System.out.println("Message doesn't contain " + stringToCheck);
                    }
                    break;
                case "Sum":
                    int beginIndex = Integer.parseInt(commandParts[1]);
                    int lastIndex = Integer.parseInt(commandParts[2]);

                    if (beginIndex < 0 || beginIndex >= encrypted.length() && lastIndex < 0 || lastIndex >= encrypted.length()){
                        System.out.println("Invalid indexes!");
                    }else{
                        int sum = 0;
                        for (int i = beginIndex; i <= lastIndex ; i++) {
                             sum += encrypted.charAt(i);
                        }
                        System.out.println(sum);
                    }
                    break;
            }
            command = scanner.nextLine();
        }

    }
}
