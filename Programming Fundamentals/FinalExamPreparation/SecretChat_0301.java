package FinalExamPreparation;

import java.util.Scanner;

public class SecretChat_0301 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String input = scanner.nextLine();

        while (!input.equals("Reveal")) {
            String[] commandData = input.split(":\\|:");
            switch (commandData[0]) {
                case "InsertSpace":
                    int spaceIndex = Integer.parseInt(commandData[1]);
                    StringBuilder sb = new StringBuilder(text);
                    text = sb.insert(spaceIndex, " ").toString();
                    System.out.println(text);
                    break;
                case "Reverse":
                    StringBuilder textToReverse = new StringBuilder(commandData[1]);
                    int index = text.indexOf(textToReverse.toString());
                    if (index == -1) {
                        System.out.println("error");
                    } else {
                        text = text.replaceFirst(textToReverse.toString(), "");
                        textToReverse = textToReverse.reverse();
                        text = text.concat(textToReverse.toString());
                        System.out.println(text);
                    }
                    break;

                case "ChangeAll":
                    String substring = commandData[1];
                    String replacement = commandData[2];
                    text = text.replaceAll(substring, replacement);
                    System.out.println(text);
                    break;

            }
            input = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s", text);
    }
}
